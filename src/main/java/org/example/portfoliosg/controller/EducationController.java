package org.example.portfoliosg.controller;

import org.example.portfoliosg.modell.Education;
import org.example.portfoliosg.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class EducationController {
    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/education")
    public String education(Model model) {
        List<Education> educationList = educationService.getEducationList();
        model.addAttribute("educationList", educationList);
        return "education";
    }
}
