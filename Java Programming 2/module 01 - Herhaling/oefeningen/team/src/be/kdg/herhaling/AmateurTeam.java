package be.kdg.herhaling;

import java.util.List;

public class AmateurTeam extends Team {
    // geen extra attributen

    public AmateurTeam(String naam) {
        super(naam);
    }

    public void show() {
        System.out.println("Naam:" + this.getNaam());
        System.out.println("Leden:");
        List<Speler> spelers = this.getSpelers();
        for (Speler speler : spelers) {
            System.out.println(speler);
        }
    }
}