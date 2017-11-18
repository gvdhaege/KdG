package be.kdg.boederij;

/**
 * Testklasse voor het project. Werk eerst alle andere klassen uit.
 * Zie onderaan voor de verwachte afdruk.
 */
public class TestKlasse {
    public static void main(String[] args) {
        Boerderij boerderij = new Boerderij();
        boerderij.voegDierToe(new Konijn("Bugs", true));
        boerderij.voegDierToe(new Koe("Belle", 15));
        boerderij.voegDierToe(new Konijn("Bunny", false));
        boerderij.voegDierToe(new Kip("Generaal Kiekens", 3));
        boerderij.voegDierToe(new Kip("Chick", 4));

        System.out.println("--------\ntoonDieren\n");
        boerderij.toonDieren();
        System.out.println("--------\nbom\n");
        boerderij.toonGeluiden();
        System.out.println("--------\netenstijd\n");
        boerderij.toonVoeding();
        System.out.println("--------\nzoeken\n");
        if (boerderij.zoekDierOpNaam("Belle")) {
            System.out.println("Belle gevonden");
        }
        if (!(boerderij.zoekDierOpNaam("Jos"))) {
            System.out.println("Jos niet gevonden");
        }
    }
}

/*
--------
toonDieren

Bugs maakt geluid Snif, eet gras en graaft wel
Belle maakt geluid Boe, eet gras en geeft 15 melk per dag
Bunny maakt geluid Snif, eet gras en graaft niet
Generaal Kiekens maakt geluid Toktok, eet mais en legt 3 eieren per week
Chick maakt geluid Toktok, eet mais en legt 4 eieren per week
--------
bom

Bugs maakt geluid Snif
Belle maakt geluid Boe
Bunny maakt geluid Snif
Generaal Kiekens maakt geluid Toktok
Chick maakt geluid Toktok
--------
etenstijd

Bugs eet gras
Belle eet gras
Bunny eet gras
Generaal Kiekens eet mais
Chick eet mais
--------
zoeken

Belle gevonden
Jos niet gevonden
*/