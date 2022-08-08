package com.example.entry.domain.user.controller.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
public class SignUpRequest {

    @NotBlank(message = "아이디는 Null, 공백, 띄어쓰기를 허용하지 않습니다.")
    private String accountId;

    @NotBlank(message = "비밀번호은 Null, 공백, 띄어쓰기를 허용하지 않습니다.")
    private String password;

    @NotBlank(message = "이름은 Null, 공백, 띄어쓰기를 허용하지 않습니다.")
    private String name;
}
