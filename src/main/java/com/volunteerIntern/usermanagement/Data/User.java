package com.volunteerIntern.usermanagement.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Builder
@AllArgsConstructor
@Document(collection = "User")
public class User {

    @Id
    private String id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "userType")
    private String userType;

    @Column(name = "purpose", length = 50)
    private String purpose;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUserType() {
        return userType;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setId(String id) {
        this.id = id;
    }
}
