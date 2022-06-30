package com.gromyk.thesis.persistence.db;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Post commentedPost;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User author;

    @CreatedDate
    @Column(columnDefinition = "TIMESTAMP")
    LocalDateTime createdAt;

    public Comment(Long id, String content, Post commentedPost, User author, LocalDateTime createdAt) {
        this.id = id;
        this.content = content;
        this.commentedPost = commentedPost;
        this.author = author;
        this.createdAt = createdAt;
    }

    public Comment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String comment) {
        this.content = comment;
    }

    public Post getCommentedPost() {
        return commentedPost;
    }

    public void setCommentedPost(Post commentedPost) {
        this.commentedPost = commentedPost;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
