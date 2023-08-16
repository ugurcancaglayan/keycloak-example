package com.caglayan.keycloak.controller;

import com.caglayan.keycloak.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("auth")
public class AuthController {

    private final UserService userService;

    @PostMapping("login")
    public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password) {
        return ResponseEntity.ok(userService.login(email, password));
    }
}
