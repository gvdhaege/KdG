package kdg.herhaling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Team implements Showable {
    private String naam;
    private List<Speler> spelers;


    public Team() {
        this.spelers = new ArrayList<>();
    }

    // 3.1 Schrijf de nodige constructor (de spelers worden achteraf toegevoegd) + een getter voor elk attribuut
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

    // 3.2 Schrijf een interface met de naam Showable met daarin een methode, de methode void showTeam()
    // Implementeer de interface in deze klasse (Let op! De methode zelf wordt hier niet uitgewerkt!)

    // 3.3 Voeg een speler aan de arraylist toe, maar alleen als het rugNummer nog niet voorkomt
    public void voegToe(Speler toeTeVoegenSpeler) {
        for (Speler speler : spelers) {
            if (speler.getRugNummer() == toeTeVoegenSpeler.getRugNummer()) {
                return;
            }
        }
        spelers.add(toeTeVoegenSpeler);
    }

    // 3.4 Sorteer de spelers volgens naam
    public void sort() {
        Collections.sort(spelers);
    }

    // 3.5 Geef de speler met het gegeven rugNummer terug, geef null terug als de speler niet gevonden is
    public Speler zoekSpeler(int rugNummer) {
        for (Speler speler : spelers) {
            if (rugNummer == speler.getRugNummer()) {
                return speler;
            }
        }
        return null;
    }

    public abstract void showTeam();
}
