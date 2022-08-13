package com.example.entry.domain.feed.exception;

import com.example.entry.global.error.exception.CustomException;
import com.example.entry.global.error.exception.ErrorCode;

public class CannotBeDeletedException extends CustomException {

    public static final CannotBeDeletedException EXCEPTION =
            new CannotBeDeletedException();

    private CannotBeDeletedException() {
        super(ErrorCode.CANNOT_BE_DELETED);
    }
}
