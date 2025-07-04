package com.dans.eureka_user.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dans.eureka_user.dto.UserResponseDTO;
import com.dans.eureka_user.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/profile/{id}")
    public UserResponseDTO getUser(@PathVariable("id") Long id) {
        System.out.println("[Profile by ID] Request Here");
        return userService.getUserById(id);
    }

    @GetMapping("/list")
    public Iterable<UserResponseDTO> getUserList() {
        System.out.println("[User List] Request Here");
        return userService.getUserList();
    }

    @GetMapping("/create")
    public UserResponseDTO createUser() {
        System.out.println("[Create User] Request Here");
        UserResponseDTO user = new UserResponseDTO();
        user.setId(1L);
        user.setName("User 1");
        user.setEmail("user1@example.com");
        return userService.createUser(user);
    }

    @GetMapping("/ping")
    public String ping() {
        System.out.println(">>> PING ENDPOINT DI UserController BERHASIL DIAKSES! <<<");
        return "PONG from DANS-EUREKA-USER!";
    }
}
