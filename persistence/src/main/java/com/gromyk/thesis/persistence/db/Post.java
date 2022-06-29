package com.gromyk.thesis.persistence.db;


import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String content;

    @CreatedDate
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime createdAt;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User author;

    @OneToMany(mappedBy = "likedPost", cascade = CascadeType.ALL)
    private List<Like> likes;

    @OneToMany(mappedBy = "commentedPost", cascade = CascadeType.ALL)
    private List<Comment> comments;

    public Post(Long id, String content, LocalDateTime createdAt, User author) {
        this.id = id;
        this.content = content;
        this.createdAt = createdAt;
        this.author = author;
    }

    public Post() {
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

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
