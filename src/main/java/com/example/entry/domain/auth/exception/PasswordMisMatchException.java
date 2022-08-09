package com.example.entry.domain.auth.exception;

import com.example.entry.global.error.exception.CustomException;
import com.example.entry.global.error.exception.ErrorCode;

public class PasswordMisMatchException extends CustomException {

    public static final PasswordMisMatchException EXCEPTION =
            new PasswordMisMatchException();

    private PasswordMisMatchException() {
        super(ErrorCode.PASSWORD_MISMATCH);
    }
}
