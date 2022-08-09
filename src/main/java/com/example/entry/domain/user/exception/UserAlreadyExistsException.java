package com.example.entry.domain.user.exception;

import com.example.entry.global.error.exception.CustomException;
import com.example.entry.global.error.exception.ErrorCode;

public class UserAlreadyExistsException extends CustomException {

    public static final UserAlreadyExistsException EXCEPTION =
            new UserAlreadyExistsException();

    private UserAlreadyExistsException() {
        super(ErrorCode.USER_EXISTS);
    }
}
