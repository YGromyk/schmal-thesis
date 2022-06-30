package com.gromyk.thesis.persistence.db.repositories;

import com.gromyk.thesis.persistence.db.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikesJPARepository extends JpaRepository<Like, Long> {
}
