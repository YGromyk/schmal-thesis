package com.gromyk.schmalthesis.rest;


import com.gromyk.thesis.persistence.db.Post;
import com.gromyk.thesis.persistence.db.Sex;
import com.gromyk.thesis.persistence.db.User;
import com.gromyk.thesis.persistence.db.repositories.PostRepository;
import com.gromyk.thesis.persistence.db.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Table;

@RestController
@Table(name = "usersthesis")
public class IndexController {
    private final UserRepository userRepository;
    private final PostRepository postRepository;

    @Autowired
    public IndexController(UserRepository userRepository, PostRepository postRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
    }


    @GetMapping("/")
    String getDefaultMessage() {
        User user = new User("email@gmail.com", "yurii", "password", Sex.Male);
        user = userRepository.save(user);
        Post postDB1 = new Post();
        postDB1.setContent("First post!");
        postDB1.setAuthor(user);
        postRepository.save(postDB1);
        Post postDB2 = new Post();
        postDB2.setContent("Second post!");
        postDB2.setAuthor(user);
        postRepository.save(postDB2);
        return "hello from spring controller!";
    }

    @GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    String getUser() {
        return userRepository.findAll().iterator().next().getName();
    }
}
