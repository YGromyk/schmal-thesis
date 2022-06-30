package com.gromyk.thesis.persistence.mappers;

import com.gromyk.thesis.persistence.db.Post;

public class PostMapper {
    public static Post domainToDB(entities.Post post) {
        Post postDB = new Post();
        postDB.setContent(post.getContent());
        postDB.setCreatedAt(post.getCreatedAt());
        postDB.setId(post.getId());
        return postDB;
    }
}
