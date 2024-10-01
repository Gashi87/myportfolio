package org.example.portfoliosg.service;

import org.example.portfoliosg.modell.Experience;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class ExperienceService {

    public List<Experience> getExperienceList() {
        return Arrays.asList(
                new Experience("Lagermedarbetare", "Ica Sverige AB",
                        "Packar, lastar och sorterar varor på lagret för att \n" +
                                "därefter skicka vidare till olika butiker.\n" +
                                "Rollen är fysiskt krävande och präglas av ett högt \n" +
                                "arbetstempo där jag arbetar i olika temperaturzoner.\n" +
                                "Tillsammans med mina kollegor ser jag till att alltid ge \n" +
                                "våra butiker god service. \n" +
                                "På grund av god prestation har jag fått gå \n" +
                                "traineeprogram som gruppchef, kompetensutveckling \n" +
                                "inom övrig lagerarbete. ",
                        LocalDate.of(2011, 4, 1), null)
        );
    }
}
