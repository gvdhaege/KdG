package be.kdg.model;

/*
De klasse Model heeft drie attributen, de eerste is de naan (type String), daarna volgen adres (object van de klasse Adres) en maten (object van de klasse Maten).
Voorzie een constructor waarin alleen de naam als parameter wordt meegegeven. Vergeet niet een Adres- en een Maten-object te maken!
Voorzie een constructor waarin naast de naam ook de 3 maten als parameter worden meegegeven. Vergeet niet een Adres-object te maken!
Voorzie een getter voor de naam.
Voorzie een methode om alle attributen van een Adres-object in één keer in te vullen. Maak gebruik van de setAdres-methode van de klasse Adres.
Voorzie een toString methode om alle informatie (naam, adres en maten) terug te geven als een string. Maak hierin gebruik van de toString-methoden van de klassen Adres en Maten.
 */
public class Model {
    private String naam;
    private Adres adres;
    private Maten maten;

    public Model(String naam) {
        this.naam = naam;
        adres = new Adres();
        maten = new Maten();
    }

    public Model(String naam, int eenBorstOmtrek, int eenTaille, int eenHeupOmtrek) {
        this.naam = naam;
        adres = new Adres();
        maten = new Maten(eenBorstOmtrek, eenTaille, eenHeupOmtrek);
    }

    public String getNaam() {
        return naam;
    }


    public void setAdres(String straat, int postNummer, String gemeente) {
        adres.setAdres(straat, postNummer, gemeente);
    }

    public String toString() {
        String string = "Naam: " + naam;
        string += "\n" + adres.toString() + "\n";
        string += maten.toString();
        return string;
    }
}

