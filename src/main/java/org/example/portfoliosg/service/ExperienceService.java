package org.example.portfoliosg.service;

import org.example.portfoliosg.modell.Experience;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class ExperienceService {

    public List<Experience> getExperienceList() {
        return List.of(
                new Experience("Lagermedarbetare", "Ica Sverige AB",
                        """
                                Packar, lastar och sorterar varor på lagret för att\s
                                därefter skicka vidare till olika butiker.
                                Rollen är fysiskt krävande och präglas av ett högt\s
                                arbetstempo där jag arbetar i olika temperaturzoner.
                                Tillsammans med mina kollegor ser jag till att alltid ge\s
                                våra butiker god service.\s
                                På grund av goda prestationer har jag fått gå\s
                                traineeprogram som gruppchef, kompetensutveckling\s
                                inom övrig lagerarbete.\s""",
                        LocalDate.of(2011, 4, 1), null)
        );
    }
}
