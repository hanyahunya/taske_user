package com.hanyahunya.user.application.dto;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public record AddUserCommand(
        UUID userId,
        String email,
        String country,
        LocalDateTime signedUpAt
) {}
