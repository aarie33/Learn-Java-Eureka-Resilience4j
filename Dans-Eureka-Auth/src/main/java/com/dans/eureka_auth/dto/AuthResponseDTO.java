package com.dans.eureka_auth.dto;

import lombok.Data;

@Data
public class AuthResponseDTO {
    private String email;
    private String token;
}
