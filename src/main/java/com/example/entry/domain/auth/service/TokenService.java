package com.example.entry.domain.auth.service;

import com.example.entry.domain.auth.controller.dto.response.TokenResponse;
import com.example.entry.domain.auth.domain.RefreshToken;
import com.example.entry.domain.auth.domain.repository.RefreshTokenRepository;
import com.example.entry.domain.auth.exception.RefreshTokenNotFoundException;
import com.example.entry.global.security.jwt.JwtProperties;
import com.example.entry.global.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class TokenService {

    private final RefreshTokenRepository refreshTokenRepository;
    private final JwtTokenProvider jwtTokenProvider;
    private final JwtProperties jwtProperties;

    @Transactional
    public TokenResponse execute(String refreshToken) {
        RefreshToken redisRefreshToken = refreshTokenRepository.findByRefreshToken(jwtTokenProvider.parseToken(refreshToken))
                .orElseThrow(() -> RefreshTokenNotFoundException.EXCEPTION);

        String newRefreshToken = jwtTokenProvider.generateRefreshToken(redisRefreshToken.getUserId());
        redisRefreshToken.updateRefreshToken(newRefreshToken, jwtProperties.getRefreshExp());

        String accessToken = jwtTokenProvider.generateAccessToken(redisRefreshToken.getUserId());
        return TokenResponse.builder()
                .accessToken(accessToken)
                .refreshToken(newRefreshToken)
                .build();
    }
}
