package org.example.portfoliosg.modell;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class Education {
    private String schoolName;
    private String programme;
    private LocalDate startDate;
    private LocalDate endDate;


    public Education(String schoolName,String programme, LocalDate startDate, LocalDate endDate) {
        this.schoolName = schoolName;
        this.programme = programme;
        this.endDate = endDate;
        this.startDate = startDate;

    }
}

