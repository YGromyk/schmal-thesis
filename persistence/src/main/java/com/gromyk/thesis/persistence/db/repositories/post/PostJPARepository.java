package com.gromyk.thesis.persistence.db.repositories.post;

import com.gromyk.thesis.persistence.db.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostJPARepository extends JpaRepository<Post, Long> {
    List<Post> findByAuthorId(Long id);
}
