package com.gromyk.thesis.persistence.db.repositories;

import com.gromyk.thesis.persistence.db.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
