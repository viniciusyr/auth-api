package com.viniciusysr.auth_api.factories.user;

import com.viniciusysr.auth_api.dtos.user.UserRecordDTO;
import com.viniciusysr.auth_api.dtos.user.UserResponseDTO;
import com.viniciusysr.auth_api.models.user.UserModel;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class UserFactory {

    public UserModel createUser(UserRecordDTO userRecordDTO){

        return new UserModel (
                userRecordDTO.login(),
                userRecordDTO.password(),
                userRecordDTO.role(),
                Instant.now());
    }

    public UserResponseDTO toResponseDTO(UserModel user){
        return new UserResponseDTO(user.getId(),
                user.getLogin(),
                user.getPassword(),
                user.getRole(),
                user.getCreatedOn());
    }
}
