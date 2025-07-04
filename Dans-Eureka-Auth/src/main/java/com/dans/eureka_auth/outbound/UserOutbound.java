package com.dans.eureka_auth.outbound;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dans.eureka_auth.dto.RegistrationRequestDTO;
import com.dans.eureka_auth.dto.UserResponseDTO;

@FeignClient(name = "dans-eureka-user")
public interface UserOutbound {

    @GetMapping("/user/profile/{id}")
    UserResponseDTO getUser(@PathVariable("id") int id);

    @PostMapping("/user/registration")
    UserResponseDTO registration(RegistrationRequestDTO registrationRequestDTO);

}

/**
 * ENABLE THIS IF YOU WANT TO USE REST TEMPLATE
 */
//
// @Component
// public class UserOutbound {
//
//     UserResponseDTO getUser(int id)
//
// }
