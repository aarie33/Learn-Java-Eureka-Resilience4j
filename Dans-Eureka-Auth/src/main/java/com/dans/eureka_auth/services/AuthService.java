package com.dans.eureka_auth.services;

import com.dans.eureka_auth.dto.*;

public interface AuthService {
    UserResponseDTO getUserDetail(int id);

    UserResponseDTO registration(RegistrationRequestDTO registrationRequestDTO);

}
