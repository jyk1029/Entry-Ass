package com.example.entry.domain.user.controller;

import com.example.entry.domain.user.controller.dto.request.SignUpRequest;
import com.example.entry.domain.user.service.SignUpService;
import com.example.entry.domain.user.service.WithdrawalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {

    private final SignUpService signUpService;
    private final WithdrawalService withdrawalService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void signUp(@RequestBody @Valid SignUpRequest signUpRequest) {
        signUpService.execute(signUpRequest);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping
    public void deleteUser() {
        withdrawalService.execute();
    }
}
