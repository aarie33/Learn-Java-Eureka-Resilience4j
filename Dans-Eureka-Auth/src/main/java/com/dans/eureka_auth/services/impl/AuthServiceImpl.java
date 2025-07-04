package com.dans.eureka_auth.services.impl;

import com.dans.eureka_auth.circuitbreaker.*;
import com.dans.eureka_auth.dto.*;
import com.dans.eureka_auth.outbound.*;
import com.dans.eureka_auth.services.*;
import lombok.*;
import org.springframework.stereotype.*;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
//    private final UserOutbound userOutbound;
    private final UserServiceCircuitBreaker userOutbound;

    public UserResponseDTO getUserDetail(int id) {
        return userOutbound.getUser(id);
    }

    public UserResponseDTO registration(RegistrationRequestDTO registrationRequestDTO) {
        return userOutbound.registration(registrationRequestDTO);
    }
}
