package com.husseinabdallah.authenticationApp.services;

import com.husseinabdallah.authenticationApp.payload.request.LoginRequest;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<?> registerUser();

    ResponseEntity<?> authenticateUser(LoginRequest loginRequest);

}
