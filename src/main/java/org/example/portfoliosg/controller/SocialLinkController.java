package org.example.portfoliosg.controller;

import org.example.portfoliosg.modell.SocialLink;
import org.example.portfoliosg.service.SocialLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SocialLinkController {

    private final SocialLinkService socialLinkService;

    @Autowired
    public SocialLinkController(SocialLinkService socialLinkService) {
        this.socialLinkService = socialLinkService;
    }

    @GetMapping("/social-links")
    public String getSocialLinks(Model model) {
        List<SocialLink> socialLinks = socialLinkService.getAllSocialLinks();
        model.addAttribute("socialLinks", socialLinks);
        return "social-links";
    }
}
