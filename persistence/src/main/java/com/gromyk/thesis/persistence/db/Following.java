package com.gromyk.thesis.persistence.db;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "followings")
public class Following {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "followers")
    private User follower;
    @ManyToOne
    @JoinColumn(name = "followings")
    private User following;

    private LocalDateTime subscribedAt;

    public Following(Long id, User follower, User following, LocalDateTime subscribedAt) {
        this.id = id;
        this.follower = follower;
        this.following = following;
        this.subscribedAt = subscribedAt;
    }

    public Following() {
    }

    public User getFollower() {
        return follower;
    }

    public void setFollower(User follower) {
        this.follower = follower;
    }

    public User getFollowing() {
        return following;
    }

    public void setFollowing(User following) {
        this.following = following;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getSubscribedAt() {
        return subscribedAt;
    }

    public void setSubscribedAt(LocalDateTime subscribedAt) {
        this.subscribedAt = subscribedAt;
    }
}
