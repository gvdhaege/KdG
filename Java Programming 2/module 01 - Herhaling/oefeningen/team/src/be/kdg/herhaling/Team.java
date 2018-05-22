package be.kdg.herhaling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Team implements Showable {
    private String naam;
    private List<Speler> spelers;

    // De volgende regel mag je niet wijzigen
    public Team() {
        this.spelers = new ArrayList<>();
    }

    public Team(String naam) {
        this.naam = naam;
        this.spelers = new ArrayList<>();
    }

    public String getNaam() {
        return naam;
    }

    public List<Speler> getSpelers() {
        return spelers;
    }

    public Speler zoekSpeler(int rugNummer) {
        for (Speler speler : spelers) {
            if (speler.getRugNummer() == rugNummer) {
                return speler;
            }
        }
        return null;
    }

    public void voegToe(Speler toeTeVoegenSpeler) {
        for (Speler speler : spelers) {
            if (speler.getRugNummer() == toeTeVoegenSpeler.getRugNummer()) {
                return;
            }
        }
        spelers.add(toeTeVoegenSpeler);
    }

    public void sort() {
        Collections.sort(spelers);
    }
}
