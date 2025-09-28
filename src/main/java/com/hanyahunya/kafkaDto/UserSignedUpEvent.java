package com.hanyahunya.kafkaDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

@ToString
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserSignedUpEvent {
    private UUID userId;
    private String email;
    private String country;
    private LocalDateTime signedUpAt;
}
