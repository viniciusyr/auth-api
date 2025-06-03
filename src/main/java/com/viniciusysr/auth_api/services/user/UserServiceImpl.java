package com.viniciusysr.auth_api.services.user;

import com.viniciusysr.auth_api.dtos.user.UserRecordDTO;
import com.viniciusysr.auth_api.dtos.user.UserResponseDTO;
import com.viniciusysr.auth_api.factories.user.UserFactory;
import com.viniciusysr.auth_api.models.user.UserModel;
import com.viniciusysr.auth_api.repositories.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserFactory userFactory;
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserFactory userFactory, UserRepository userRepository) {
        this.userFactory = userFactory;
        this.userRepository = userRepository;
    }

    @Override
    public UserResponseDTO createUser(UserRecordDTO userRecordDTO) {
        if(userRecordDTO == null){
            throw new RuntimeException("UserRecordDTO is null");
        }

        UserModel user = userFactory.createUser(userRecordDTO);
        userRepository.save(user);

        return userFactory.toResponseDTO(user);
    }
}
