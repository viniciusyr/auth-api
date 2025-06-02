package com.viniciusysr.auth_api.models.user;

import com.viniciusysr.auth_api.enums.user.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.Instant;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="TB_USERS")
public class UserModel{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String login;
    private String password;
    private UserRole role;

    @Timestamp
    private Instant createdOn;

    public UserModel(@NotBlank String login, @NotBlank String password, UserRole role, Instant createdOn) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.createdOn = createdOn;
    }
}
