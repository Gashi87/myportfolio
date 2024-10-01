package org.example.portfoliosg.modell;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Project {
    private String projectName;
    private String description;
    private String projectUrl;

    public Project(String projectName, String projectUrl, String description) {
        this.projectName = projectName;
        this.projectUrl = projectUrl;
        this.description = description;
    }
}

