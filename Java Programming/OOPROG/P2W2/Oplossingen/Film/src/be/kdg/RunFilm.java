package be.kdg;

import be.kdg.film.Film;
import be.kdg.film.Verzameling;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */
public class RunFilm {
    public static void main(String[] args) {
        Verzameling verzameling = new Verzameling();
        Film[] films = verzameling.getVerzameling();

        for(int i = 0; i < verzameling.getAantal() ; i++) {
            System.out.println(films[i]);
        }
    }
}

/*
Ronin                1998 DVD      Dolby
Lakeview Terrace     2008 BluRay   Dolby HD
Ghost Town           2008 DVD      Dolby
Stealth              2005 BluRay   PCM
Fast & Furious 6     2013 BluRay   DTS HD
Twilight             2008 DVD      Dolby
The Brave One        2007 BluRay   DTS
*/
