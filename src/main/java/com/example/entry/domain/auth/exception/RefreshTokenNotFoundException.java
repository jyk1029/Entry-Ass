package com.example.entry.domain.auth.exception;

import com.example.entry.global.error.exception.CustomException;
import com.example.entry.global.error.exception.ErrorCode;

public class RefreshTokenNotFoundException extends CustomException {

    public static final RefreshTokenNotFoundException EXCEPTION =
            new RefreshTokenNotFoundException();

    private RefreshTokenNotFoundException() {
        super(ErrorCode.REFRESH_TOKEN_NOT_FOUND);
    }
}
