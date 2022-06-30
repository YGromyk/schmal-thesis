package com.gromyk.thesis.persistence.db.repositories;

import com.gromyk.thesis.persistence.db.Following;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowingJPARepository extends JpaRepository<Following, Long> {
}
