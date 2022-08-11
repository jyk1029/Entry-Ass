package com.example.entry.domain.user.service;

import com.example.entry.domain.user.domain.User;
import com.example.entry.domain.user.domain.repository.UserRepository;
import com.example.entry.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class WithdrawalService {

    private final UserRepository userRepository;
    private final UserFacade userFacade;

    @Transactional
    public void deleteUser() {
        User user = userFacade.getCurrentUser();

        userRepository.delete(user);
    }

}
