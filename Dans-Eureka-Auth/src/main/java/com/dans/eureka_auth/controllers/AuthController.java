package com.dans.eureka_auth.controllers;

import java.util.UUID;

import lombok.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dans.eureka_auth.dto.AuthRequestDTO;
import com.dans.eureka_auth.dto.AuthResponseDTO;
import com.dans.eureka_auth.dto.RegistrationRequestDTO;
import com.dans.eureka_auth.dto.UserResponseDTO;
import com.dans.eureka_auth.services.AuthService;

@RestController
@RequestMapping("auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/login")
    public AuthResponseDTO auth(@RequestBody AuthRequestDTO authRequestDTO) {
        UserResponseDTO userDetail = authService.getUserDetail(1);

        System.out.println("[Login] Request Here");

        if (userDetail == null) {
            return null;
        }

        String token = UUID.randomUUID().toString();
        AuthResponseDTO authResponseDTO = new AuthResponseDTO();
        authResponseDTO.setToken(token);
        authResponseDTO.setEmail(userDetail.getEmail());

        return authResponseDTO;
    }

    @PostMapping("/registration")
    public AuthResponseDTO registration(@RequestBody RegistrationRequestDTO registrationRequestDTO) {
        UserResponseDTO registration = authService.registration(registrationRequestDTO);

        System.out.println("[Registration] Request Here");
        
        if (registration == null) {
            return null;
        }

        String token = UUID.randomUUID().toString();
        AuthResponseDTO authResponseDTO = new AuthResponseDTO();
        authResponseDTO.setToken(token);
        authResponseDTO.setEmail(registration.getEmail());

        return authResponseDTO;
    }
    
}
