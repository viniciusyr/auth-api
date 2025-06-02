package com.viniciusysr.auth_api.dtos.user;

import com.viniciusysr.auth_api.enums.user.UserRole;
import jakarta.validation.constraints.NotBlank;

public record UserRecordDTO(@NotBlank String login, @NotBlank String password, UserRole role) {
}
