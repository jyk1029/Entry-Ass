package com.example.entry.global.exception;

import com.example.entry.global.error.exception.CustomException;
import com.example.entry.global.error.exception.ErrorCode;

public class SignatureTokenException extends CustomException {

    public static final SignatureTokenException EXCEPTION =
            new SignatureTokenException();

    private SignatureTokenException() {
        super(ErrorCode.SIGNATURE_JWT);
    }
}
