package entities;

import java.time.LocalDateTime;

public class Post {
    private long id;
    private String content;
    private LocalDateTime createdAt;
    private long authorId;
    private int likesCount;
    private int commentCounts;

    public Post(long id, String content, LocalDateTime createdAt, long authorId, int likesCount, int commentCounts) {
        this.id = id;
        this.content = content;
        this.createdAt = createdAt;
        this.authorId = authorId;
        this.likesCount = likesCount;
        this.commentCounts = commentCounts;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public int getCommentCounts() {
        return commentCounts;
    }

    public void setCommentCounts(int commentCounts) {
        this.commentCounts = commentCounts;
    }
}
