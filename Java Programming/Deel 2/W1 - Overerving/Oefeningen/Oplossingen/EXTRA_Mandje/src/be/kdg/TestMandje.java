package be.kdg;

import be.kdg.mandje.*;

/*
Deze klasse kan je gebruiken om je programma uit te testen. Zie ook de verwachte uitvoer onderaan!
 */

public class TestMandje {
    public static void main(String[] args) {
        Artikel[] artikels = {
                new Artikel(100, "Badhanddoek", 12.5, 25),
                new Artikel(200, "The Naked Chef", 19.90, 6),
                new Artikel(201, "Vrouwen komen van Venus, Mannen van Mars", 21.90, 6),
                new ImportArtikel(400, "Chinees Vuurwerk", 45.50, 25, 15),
                new TaxfreeArtikel(600, "Chanel N°5", 119.95)
        };

        Mandje mandje = new Mandje();

        mandje.add(new Aankoop(artikels[0], 2));
        mandje.add(new Aankoop(artikels[1], 1));
        mandje.add(new Aankoop(artikels[2], 1));
        mandje.add(new Aankoop(artikels[3], 5));
        mandje.add(new Aankoop(artikels[4], 2));

        mandje.toon();
        mandje.printFactuur();
        mandje.printTotaalTaksen();
    }
}

/*
100 Badhanddoek €12.5 25%
aantal: 2
200 The Naked Chef €19.9 6%
aantal: 1
201 Vrouwen komen van Venus, Mannen van Mars €21.9 6%
aantal: 1
400 Chinees Vuurwerk €45.5 25% €15.0
aantal: 5
600 Chanel N°5 €119.95
aantal: 2

Factuur:

Badhanddoek                               aantal:  2  prijs: € 25,00  btw: € 6,25  totaal: € 31,25
The Naked Chef                            aantal:  1  prijs: € 19,90  btw: € 1,19  totaal: € 21,09
Vrouwen komen van Venus, Mannen van Mars  aantal:  1  prijs: € 21,90  btw: € 1,31  totaal: € 23,21
Chinees Vuurwerk                          aantal:  5  prijs: €227,50  btw: €56,88  totaal: €284,38
Chanel N°5                                aantal:  2  prijs: €239,90  btw: € 0,00  totaal: €239,90

Totaal zonder BTW : €534,20
Totaal BTW        : € 65,63
Totaal met BTW    : €599,83
Totaal taksen     : € 15,00
*/