package org.example.portfoliosg.controller;

import org.example.portfoliosg.modell.Experience;
import org.example.portfoliosg.service.ExperienceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class ExperienceController {
    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping("/experience")
    public String experience(Model model) {
        List<Experience> experienceList = experienceService.getExperienceList();
        model.addAttribute("experienceList", experienceList);
        return "experience";
    }
}
