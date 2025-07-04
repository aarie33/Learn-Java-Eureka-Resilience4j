package com.dans.eureka_auth.circuitbreaker;

import com.dans.eureka_auth.dto.*;
import com.dans.eureka_auth.outbound.*;
import io.github.resilience4j.circuitbreaker.annotation.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceCircuitBreaker {

    private final UserOutbound userOutbound;

    private int counter = 0;

    @CircuitBreaker(name = "userOutbound", fallbackMethod = "fallbackUserResponse")
    public UserResponseDTO getUser(int id) {
        log.info("counter: {}", counter);
        counter++;
        return userOutbound.getUser(id);
    }

    @CircuitBreaker(name = "userOutbound", fallbackMethod = "fallbackUserResponse")
    public UserResponseDTO registration(RegistrationRequestDTO registrationRequestDTO) {
        log.info("counter: {}", counter);
        counter++;
        return userOutbound.registration(registrationRequestDTO);
    }

    private UserResponseDTO fallbackUserResponse(int id, Throwable th) {
        log.error("Error calling userOutbound service: {}, id: {}", th.getMessage(), id);
        return new UserResponseDTO();
    }
}
