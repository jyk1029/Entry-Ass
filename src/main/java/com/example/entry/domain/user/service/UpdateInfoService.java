package com.example.entry.domain.user.service;

import com.example.entry.domain.user.controller.dto.request.UpdateInfoRequest;
import com.example.entry.domain.user.domain.User;
import com.example.entry.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UpdateInfoService {

    private final PasswordEncoder passwordEncoder;
    private final UserFacade userFacade;

    @Transactional
    public void execute(UpdateInfoRequest updateInfoRequest) {
        User user = userFacade.getCurrentUser();

        user.updateUser(
                passwordEncoder.encode(updateInfoRequest.getPassword()),
                updateInfoRequest.getName());
    }
}
