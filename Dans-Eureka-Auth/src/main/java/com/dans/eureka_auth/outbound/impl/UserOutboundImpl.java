package com.dans.eureka_auth.outbound.impl;

/**
 * ENABLE THIS IF YOU WANT TO USE REST TEMPLATE
 */
// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.stereotype.Component;
// import org.springframework.web.client.RestTemplate;

// import com.dans.eureka_auth.dto.UserResponseDTO;
// import com.dans.eureka_auth.outbound.UserOutbound;

// @Component
// public class UserOutboundImpl implements UserOutbound {

//     private final RestTemplate restTemplate;

//     public UserOutboundImpl(@Qualifier("restTemplate") RestTemplate restTemplate) {
//         this.restTemplate = restTemplate;
//     }
    
//     @Override
//     public UserResponseDTO getUser(int id) {
//         return restTemplate.getForObject("/profile/{id}", UserResponseDTO.class, id);
//     }

// }

public class UserOutboundImpl {}