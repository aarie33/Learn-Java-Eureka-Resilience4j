package com.dans.eureka_auth.dto;

import lombok.Data;

@Data
public class RegistrationRequestDTO {
    private String email;
    private String name;
    private String password;
}
