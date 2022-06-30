package repositories;

import entities.Post;

import java.util.List;

public interface PostRepository {
    public Post save(Post post);

    public void remove(Post post);

    public List<Post> getPostsForUserId(long id);
}
