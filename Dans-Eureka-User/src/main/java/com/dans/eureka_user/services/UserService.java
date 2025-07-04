package com.dans.eureka_user.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dans.eureka_user.dto.UserResponseDTO;

@Service
public class UserService {

    public UserResponseDTO getUserById(Long id) {
        UserResponseDTO dto = new UserResponseDTO();
        dto.setId(id);
        dto.setName("User " + id);
        dto.setEmail("user" + id + "@example.com");
        return dto;
    }

    public Iterable<UserResponseDTO> getUserList() {
        List<UserResponseDTO> userList = new ArrayList<>();

        UserResponseDTO user1 = new UserResponseDTO();
        user1.setId(1L);
        user1.setName("User 1");
        user1.setEmail("user1@example.com");
        userList.add(user1);

        UserResponseDTO user2 = new UserResponseDTO();
        user2.setId(2L);
        user2.setName("User 2");
        user2.setEmail("user2@example.com");
        userList.add(user2);
        return userList;
    }

    public UserResponseDTO createUser(UserResponseDTO user) {
        return user;
    }
}
