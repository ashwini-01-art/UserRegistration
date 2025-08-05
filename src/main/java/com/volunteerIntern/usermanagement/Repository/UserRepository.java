package com.volunteerIntern.usermanagement.Repository;

import com.volunteerIntern.usermanagement.Data.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    public Optional<User> findByName(String name);
}
