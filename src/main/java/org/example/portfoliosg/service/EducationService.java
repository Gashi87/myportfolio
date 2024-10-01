package org.example.portfoliosg.service;

import org.example.portfoliosg.modell.Education;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
@Service
public class EducationService {

    public List<Education> getEducationList() {
        return Arrays.asList(
                new Education("Carlforsska","Omvårdnadsprogrammet",LocalDate.of(2004, 8, 20), LocalDate.of(2007, 6, 10)),
                new Education("Nackademin","Javautvecklare",LocalDate.of(2023,8,23),LocalDate.of(2025, 5,29))
        );
    }

}
