package org.example.portfoliosg.controller;

import org.example.portfoliosg.modell.PersonalInfo;
import org.example.portfoliosg.service.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonalInfoController {

    private final PersonalInfoService personalInfoService;

    @Autowired
    public PersonalInfoController(PersonalInfoService personalInfoService) {
        this.personalInfoService = personalInfoService;
    }

    @GetMapping("/personal-info")
    public String personalInfo(Model model) {
        PersonalInfo personalInfo = personalInfoService.getPersonalInfo();
        model.addAttribute("personalInfo", personalInfo);
        return "personalInfo";
    }
}
