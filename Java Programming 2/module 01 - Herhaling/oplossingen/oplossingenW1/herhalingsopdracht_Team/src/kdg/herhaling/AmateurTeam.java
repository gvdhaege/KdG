package kdg.herhaling;

import java.util.List;

public class AmateurTeam extends Team {
    // 5.1 Laat de klasse van de klasse Team overerven

    // 5.2 Schrijf de nodige constructor + een getter voor de naam van het team
    public AmateurTeam(String naam) {
        super(naam);
    }

    // 5.3 Implementeer hier de methode van de interface (showTeam),
    // ze toont alle informatie in verband met het team (zie verder voor een voorbeeld)
    public void showTeam() {
        System.out.println("Naam: " + getNaam());
        System.out.println("Leden:");
        List<Speler> spelers = super.getSpelers();
        for (Speler speler : spelers) {
            System.out.println(speler);
        }
    }
}
