package com.gromyk.thesis.persistence.db.repositories.user;

import com.gromyk.thesis.persistence.mappers.UserMapper;
import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repositories.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserRepositoryImpl implements UserRepository {
    UserJPARepository userRepo;

    @Autowired
    UserRepositoryImpl(UserJPARepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User findByEmail(String email) {
        return UserMapper.dbToDomain(userRepo.findByEmail(email));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll().stream().map(UserMapper::dbToDomain).collect(Collectors.toList());
    }

    @Override
    public User save(User user) {
        return UserMapper.dbToDomain(userRepo.save(UserMapper.domainToDB(user)));
    }

    @Override
    public void remove(User user) {
        userRepo.delete(UserMapper.domainToDB(user));
    }
}
