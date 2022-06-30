package entities;

import java.time.LocalDateTime;

public class User {
    private long id;
    private String name;
    private String email;
    private LocalDateTime birthday;
    private Sex sex;
    private int postsCount;
    private int followersCount;
    private String password;

    public User(long id, String name, String email, LocalDateTime birthday, Sex sex, int postsCount, int followersCount, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.sex = sex;
        this.postsCount = postsCount;
        this.followersCount = followersCount;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public void setPostsCount(int postsCount) {
        this.postsCount = postsCount;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
