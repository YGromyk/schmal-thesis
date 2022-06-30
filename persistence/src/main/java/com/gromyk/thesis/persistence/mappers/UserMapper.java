package com.gromyk.thesis.persistence.mappers;

import com.gromyk.thesis.persistence.db.User;

import java.time.LocalDateTime;

public class UserMapper {
    public static entities.User dbToDomain(User user) {
        return new entities.User(user.getId(), user.getName(), user.getEmail(), LocalDateTime.now(), SexMapper.dbToDomain(user.getSex()), 0, 0, user.getPassword());
    }

    public static User domainToDB(entities.User user) {
        User userDB = new User();
        userDB.setId(user.getId());
        userDB.setEmail(user.getEmail());
        userDB.setName(user.getName());
        userDB.setSex(SexMapper.domainToDB(user.getSex()));
        userDB.setPassword(user.getPassword());
        return userDB;
    }
}
