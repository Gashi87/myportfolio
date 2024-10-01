package org.example.portfoliosg.service;

import org.example.portfoliosg.modell.PersonalInfo;
import org.springframework.stereotype.Service;

@Service
public class PersonalInfoService {

    public PersonalInfo getPersonalInfo() {

        return new PersonalInfo(
                "Shayan Ghefouri",
                "shayan.ghefouri@yh.nackademin.se",
                "Jag är född och uppvuxen i norra Irak i ett område som kallas för Kurdistan," +
                        "har bott i Sverige sedan 2001.",
                "C:\\Users\\shaya\\OneDrive\\Bilder\\IMG_20230920_123044.jpg"
        );
    }
}
