package com.gromyk.thesis.persistence.db.repositories;

import com.gromyk.thesis.persistence.db.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comment, Long> {
}
