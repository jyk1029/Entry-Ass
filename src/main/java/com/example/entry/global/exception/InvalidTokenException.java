package com.example.entry.global.exception;

import com.example.entry.global.error.exception.CustomException;
import com.example.entry.global.error.exception.ErrorCode;

public class InvalidTokenException extends CustomException {

    public static final InvalidTokenException EXCEPTION =
            new InvalidTokenException();

    private InvalidTokenException() {
        super(ErrorCode.INVALID_JWT);
    }
}
