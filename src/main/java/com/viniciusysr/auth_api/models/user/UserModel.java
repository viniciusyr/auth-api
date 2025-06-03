package com.viniciusysr.auth_api.models.user;

import com.viniciusysr.auth_api.enums.user.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="TB_USERS")
public class UserModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String login;
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_role")
    private UserRole role;

    @CreationTimestamp
    private Instant createdOn;

    public UserModel(String login, String password, UserRole role, Instant createdOn) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.createdOn = createdOn;
    }
}
