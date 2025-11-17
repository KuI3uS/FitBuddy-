package com.fitbuddy.controller;


import com.fitbuddy.dto.RegisterRequest;
import com.fitbuddy.model.User;
import com.fitbuddy.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UserService userService;


    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody RegisterRequest reguest) {
        try{
            User user = userService.register(reguest);

            return ResponseEntity.status(HttpStatus.CREATED).body(
                    Map.of(
                            "id", user.getId(),
                            "email", user.getEmail()
                    )
            );


        } catch (IllegalStateException ex){
            return ResponseEntity.status(HttpStatus.CONFLICT).body(
                    Map.of("error", ex.getMessage())
            );
        }
    }
}
