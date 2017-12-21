package be.kdg;

import be.kdg.auteur.Auteur;
import be.kdg.auteur.AuteursData;

/**
 * Vul in de klasse Auteur het nodige aan om de onderstaande uitvoer te bekomen.
 * Dit is een voorbeeld van het gebruik van een unchecked exception.
 * Merk op dat als we de exception in dit geval gewoon negeren, het programma
 * verder gaat alsof er niets aan de hand is.
 */
public class TestAuteur {
    public static void main(String[] args) {
        AuteursData data = new AuteursData();
        AuteursData.AuteurData[] auteurs = data.getAuteurs();

        for (AuteursData.AuteurData deAuteur : auteurs) {
            try {
                Auteur auteur = new Auteur(deAuteur.getNaam(),
                        deAuteur.getGeboorteDatum(), deAuteur.getBoeken());
                System.out.println(auteur);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

/*
De auteurnaam is niet ingevuld
De auteurnaam is niet ingevuld
De geboortedatum is foutief
De boekenlijst mag niet leeg zijn
De boekenlijst mag niet leeg zijn
naam: Jos Vandeloo - geboorteDatum: dinsdag 16 oktober 1928 - boeken: De Muur, Het Gevaar, Het huis der onbekenden
*/

