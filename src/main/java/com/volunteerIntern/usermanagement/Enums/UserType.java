package com.volunteerIntern.usermanagement.Enums;


public enum UserType {

    VOLUNTEER, INTERN;

    public static UserType fromString(String type){
        String userType = type.toLowerCase();
        switch (userType){
            case "volunteer":
                return UserType.VOLUNTEER;
            case "intern":
                return UserType.INTERN;
            default:
                return null;
        }
    }

}
