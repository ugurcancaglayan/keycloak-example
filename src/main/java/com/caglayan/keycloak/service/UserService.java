package com.caglayan.keycloak.service;

import com.caglayan.keycloak.model.User;
import com.caglayan.keycloak.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public String login(String email, String password) {
        User user = userRepository.findByEmailAndPassword(email, password);

        if (user != null) {
            return "Login successfully.";
        } else {
            return "Login failed.";
        }
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

}
