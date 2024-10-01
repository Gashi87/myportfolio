package org.example.portfoliosg.service;

import org.example.portfoliosg.modell.SocialLink;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SocialLinkService {

    private final List<SocialLink> socialLinks = new ArrayList<>();

    public SocialLinkService() {
        // Lägg till dina länkar här
        socialLinks.add(new SocialLink("Email", "shayan.ghefouri@yh.nackademin.se"));
        socialLinks.add(new SocialLink("LinkedIn", "https://linkedin.com/in/shayan-ghefouri-80210a290"));
        socialLinks.add(new SocialLink("GitHub", "https://github.com/gashi87"));
    }

    public List<SocialLink> getAllSocialLinks() {
        return socialLinks;
    }
}
