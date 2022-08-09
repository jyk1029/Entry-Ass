package com.example.entry.global.exception;

import com.example.entry.global.error.exception.CustomException;
import com.example.entry.global.error.exception.ErrorCode;

public class ExpiredTokenException extends CustomException {

    public static final ExpiredTokenException EXCEPTION =
            new ExpiredTokenException();

    private ExpiredTokenException() {
        super(ErrorCode.EXPIRED_JWT);
    }
}
