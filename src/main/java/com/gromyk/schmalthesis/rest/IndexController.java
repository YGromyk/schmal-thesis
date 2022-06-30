package com.gromyk.schmalthesis.rest;


import com.gromyk.thesis.persistence.db.repositories.user.UserRepositoryImpl;
import entities.Sex;
import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import repositories.UserRepository;

import javax.persistence.Table;
import java.time.LocalDateTime;

@RestController
@Table(name = "usersthesis")
public class IndexController {
    private final UserRepository userRepository;

    @Autowired
    public IndexController(UserRepositoryImpl userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/")
    String getDefaultMessage() {
        User user = new User(1L, "yurii", "email@gmail.com", LocalDateTime.now(), Sex.Male, 0, 0, "pass");
        user = userRepository.save(user);

        return "hello from spring controller!";
    }

    @GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    String getUser() {
        return userRepository.findByEmail("email@gmail.com").getEmail();
    }
}
