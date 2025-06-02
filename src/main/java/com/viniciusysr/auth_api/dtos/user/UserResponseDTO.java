package com.viniciusysr.auth_api.dtos.user;

import com.viniciusysr.auth_api.enums.user.UserRole;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {

    private UUID id;
    private String login;
    private String password;
    private UserRole role;
    private Instant createdOn;

}
