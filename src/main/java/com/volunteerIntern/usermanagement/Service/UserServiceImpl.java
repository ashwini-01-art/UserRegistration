package com.volunteerIntern.usermanagement.Service;

import com.volunteerIntern.usermanagement.Data.User;
import com.volunteerIntern.usermanagement.Enums.UserType;
import com.volunteerIntern.usermanagement.Exception.UserTypeNotFoundException;
import com.volunteerIntern.usermanagement.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        String userType = user.getUserType();
        String name = user.getName();
        if(UserType.fromString(userType) == null) throw new UserTypeNotFoundException("user type not supported");
        String id = UUID.randomUUID().toString();
        user.setId(id);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
