package org.example.portfoliosg.service;

import org.example.portfoliosg.modell.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    private final List<Project> projects = new ArrayList<>();

    public ProjectService() {
        projects.add(new Project("Best Gym Ever", "https://github.com/Gashi87/BestGymEver",
                "Ett gymsystem där det går att spåra om medlemmarna är faktiska vid IT-strul "));

    }

    public List<Project> getAllProjects() {
        return projects;
    }

    public void addProject(Project project) {
        projects.add(project);
    }
}
