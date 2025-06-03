package com.viniciusysr.auth_api.dtos.user;

import com.viniciusysr.auth_api.enums.user.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
public class UserResponseDTO {

    private UUID id;
    private String login;
    private String password;
    private UserRole role;
    private Instant createdOn;

}
