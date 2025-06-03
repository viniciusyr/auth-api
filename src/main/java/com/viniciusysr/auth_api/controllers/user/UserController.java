package com.viniciusysr.auth_api.controllers.user;

import com.viniciusysr.auth_api.dtos.user.UserRecordDTO;
import com.viniciusysr.auth_api.dtos.user.UserResponseDTO;
import com.viniciusysr.auth_api.services.user.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/users")
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody @Valid UserRecordDTO data){
        UserResponseDTO newUser = userService.createUser(data);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }
}
