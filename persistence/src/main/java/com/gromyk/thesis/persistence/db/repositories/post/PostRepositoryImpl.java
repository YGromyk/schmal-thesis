package com.gromyk.thesis.persistence.db.repositories.post;

import entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repositories.PostRepository;

import java.util.List;

@Component
public class PostRepositoryImpl implements PostRepository {
    private PostJPARepository repository;

    @Autowired
    PostRepositoryImpl(PostJPARepository repository) {
        this.repository = repository;
    }

    @Override
    public Post save(Post post) {
        return null;
    }

    @Override
    public void remove(Post post) {

    }

    @Override
    public List<Post> getPostsForUserId(long id) {
        return null;
    }
}
