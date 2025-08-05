package com.volunteerIntern.usermanagement.Service;

import com.volunteerIntern.usermanagement.Data.User;

import java.util.List;

public interface UserService {

    public User registerUser(User user);

    public List<User> getAllUsers();
}
