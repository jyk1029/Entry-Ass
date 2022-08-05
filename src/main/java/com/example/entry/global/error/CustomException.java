package com.example.entry.global.error;

import com.example.entry.global.error.exception.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CustomException extends RuntimeException{

    private ErrorCode errorCode;
}
