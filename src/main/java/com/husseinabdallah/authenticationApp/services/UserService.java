package com.husseinabdallah.authenticationApp.services;

import com.husseinabdallah.authenticationApp.payload.request.LoginRequest;
import com.husseinabdallah.authenticationApp.payload.request.SignupRequest;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<?> registerUser(SignupRequest signUpRequest);
    ResponseEntity<?> authenticateUser(LoginRequest loginRequest);

}
