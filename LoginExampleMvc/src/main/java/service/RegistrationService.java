package service;

import java.util.List;

import entity.User;

public interface RegistrationService {

    public User getUser(int userId);

    public void addUser(User user);

    public void updateUser(User user);

    public void removeUser(int userId);

    public List<User> listUsers();
}
