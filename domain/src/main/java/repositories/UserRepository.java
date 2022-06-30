package repositories;

import entities.User;

import java.util.List;

public interface UserRepository {
    public User findByEmail(String email);

    public List<User> getAllUsers();

    public User save(User user);

    public void remove(User user);
}
