package com.example.entry.domain.user.exception;

import com.example.entry.global.error.CustomException;
import com.example.entry.global.error.exception.ErrorCode;

public class UserNotFoundException extends CustomException {

    public static final UserNotFoundException EXCEPTION =
            new UserNotFoundException();

    private UserNotFoundException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}
