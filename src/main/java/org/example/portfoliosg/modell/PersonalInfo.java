package org.example.portfoliosg.modell;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonalInfo {
    private String name;
    private String email;
    private String bio;
    private String profileImageUrl;

    public PersonalInfo(String name, String email, String bio, String profileImageUrl) {
        this.name = name;
        this.email = email;
        this.bio = bio;
        this.profileImageUrl = profileImageUrl;
    }
}
