package com.gromyk.thesis.persistence.db;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "likes")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User whoLiked;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Post likedPost;

    @CreatedDate
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime likedAt;

    public Like(Long id, User whoLiked, Post likedPost, LocalDateTime likedAt) {
        this.id = id;
        this.whoLiked = whoLiked;
        this.likedPost = likedPost;
        this.likedAt = likedAt;
    }

    public Like() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getWhoLiked() {
        return whoLiked;
    }

    public void setWhoLiked(User whoLiked) {
        this.whoLiked = whoLiked;
    }

    public Post getLikedPost() {
        return likedPost;
    }

    public void setLikedPost(Post likedPost) {
        this.likedPost = likedPost;
    }

    public LocalDateTime getLikedAt() {
        return likedAt;
    }

    public void setLikedAt(LocalDateTime likedAt) {
        this.likedAt = likedAt;
    }
}
