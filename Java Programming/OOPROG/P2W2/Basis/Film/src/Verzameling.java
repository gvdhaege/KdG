import dragers.Drager;
import dragers.Geluid;

import static dragers.Drager.*;
import static dragers.Geluid.*;

public class Verzameling {
    private Film[] verzameling = new Film[2000];
    private int aantalFilms;

    public Verzameling() {
        vulTabel();
    }

    public int getAantalFilms() {
        return aantalFilms;
    }

    public Film[] getVerzameling() {
        return verzameling;
    }

    private void vulTabel() {
        voegFilmToe("Ronin", 1998, DVD, DOLBY);
        voegFilmToe("Lakeview Terrace", 2008, BLU_RAY, DOLBY_HD);
        voegFilmToe("Ghost Town", 2008, DVD, DOLBY);
        voegFilmToe("Stealth", 2005, BLU_RAY, PCM);
        voegFilmToe("Fast & Furious 6", 2013, BLU_RAY, DTS_HD);
        voegFilmToe("Twilight", 2008, DVD, DOLBY);
        voegFilmToe("The Brave One", 2007, BLU_RAY, DTS);
    }

    private void voegFilmToe(String titel, int jaartal, Drager drager, Geluid geluid) {
        verzameling[aantalFilms++] = new Film(titel, jaartal, drager, geluid);
    }
}
