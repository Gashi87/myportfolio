package org.example.portfoliosg.modell;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SocialLink {
    private String platformName;
    private String profileUrl;

    public SocialLink(String platformName, String profileUrl) {
        this.platformName = platformName;
        this.profileUrl = profileUrl;
    }
}

