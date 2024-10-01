package org.example.portfoliosg.modell;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class Experience {
    private String jobTitle;
    private String company;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    public Experience(String jobTitle, String company, String description, LocalDate startDate, LocalDate endDate) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}

