package com.example.entry.global.error.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    INTERNAL_SERVER_ERROR(500, "내부 서버 오류입니다.");

    private final int status;
    private final String message;
}
