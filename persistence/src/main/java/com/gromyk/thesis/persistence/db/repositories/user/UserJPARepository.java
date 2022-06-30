package com.gromyk.thesis.persistence.db.repositories.user;

import com.gromyk.thesis.persistence.db.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPARepository extends JpaRepository<User, Long> {
    User findByEmail(String userEmail);
}
