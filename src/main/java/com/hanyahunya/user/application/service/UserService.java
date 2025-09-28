package com.hanyahunya.user.application.service;

import com.hanyahunya.user.application.dto.AddUserCommand;
import com.hanyahunya.user.application.port.in.UserUseCase;
import com.hanyahunya.user.domain.model.User;
import com.hanyahunya.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService implements UserUseCase {
    private final UserRepository userRepository;

    @Transactional
    @Override
    public void addUser(AddUserCommand command) {
        User user = User.builder()
                .userId(command.userId())
                .email(command.email())
                .country(command.country())
                .signupedAt(command.signedUpAt())
                .build();
        userRepository.save(user);
    }
}
