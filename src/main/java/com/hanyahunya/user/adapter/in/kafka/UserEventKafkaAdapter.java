package com.hanyahunya.user.adapter.in.kafka;

import com.hanyahunya.kafkaDto.UserSignedUpEvent;
import com.hanyahunya.user.application.dto.AddUserCommand;
import com.hanyahunya.user.application.port.in.UserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@KafkaListener(topics = "user-events", groupId = "user-group")
public class UserEventKafkaAdapter {
    private final UserUseCase userUseCase;

    @KafkaHandler
    public void userSignedUp(UserSignedUpEvent event) {
        AddUserCommand command = AddUserCommand.builder()
                .userId(event.getUserId())
                .email(event.getEmail())
                .country(event.getCountry())
                .signedUpAt(event.getSignedUpAt())
                .build();
        userUseCase.addUser(command);
    }
}
