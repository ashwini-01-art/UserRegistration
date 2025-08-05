package com.volunteerIntern.usermanagement.Exception;

public class UserTypeNotFoundException extends RuntimeException {
    public UserTypeNotFoundException(String message) {
        super(message);
    }
}
