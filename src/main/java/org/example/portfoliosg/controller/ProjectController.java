package org.example.portfoliosg.controller;

import org.example.portfoliosg.modell.Project;
import org.example.portfoliosg.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/projects")
    public String getAllProjects(Model model) {
        List<Project> projects = projectService.getAllProjects();
        model.addAttribute("projects", projects);
        return "projects";
    }

    @PostMapping("/projects/add")
    public String addProject(Project project) {
        projectService.addProject(project);
        return "redirect:/projects";
    }
}
