package com.viniciusysr.auth_api.services.user;

import com.viniciusysr.auth_api.dtos.user.UserRecordDTO;
import com.viniciusysr.auth_api.dtos.user.UserResponseDTO;

public interface UserService{
    UserResponseDTO createUser(UserRecordDTO userRecordDTO);
}
