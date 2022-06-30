package com.gromyk.thesis.persistence.db;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String email;
    private String name;
    private String password;

    @Enumerated(EnumType.ORDINAL)
    private Sex sex;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Post> posts;


    @OneToMany()
    @JoinColumn(name = "followers")
    private List<Following> followings;
    @OneToMany
    @JoinColumn(name = "followings")
    private List<Following> followers;

    public User(String email, String name, String password, Sex sex, List<Following> followings, List<Following> followers) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.followings = followings;
        this.followers = followers;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Following> getFollowings() {
        return followings;
    }

    public void setFollowings(List<Following> followings) {
        this.followings = followings;
    }

    public List<Following> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Following> followers) {
        this.followers = followers;
    }
}
