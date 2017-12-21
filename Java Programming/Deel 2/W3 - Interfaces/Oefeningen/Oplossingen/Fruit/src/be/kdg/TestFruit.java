package be.kdg;

import be.kdg.fruit.*;

/**
 * In deze klasse mag je niets wijzigen, ze dient alleen om het programma
 * te laten uitvoeren, op die manier kan je aan de hand van de onderstaande
 * uitvoer de werking van de overige klassen testen.
 */
public class TestFruit {
    public static Fruit[] fruitsoorten = new Fruit[] {
        new Citroen("Algarve", 3.0),
        new Sinaasappel("Jaffa", 3.2, true),
        new Sinaasappel("Bloedappelsien", 3.4, true),
        new Pompelmoes("Roze pompelmoes", 3.1, "roze"),
        new Sinaasappel("Persappelsien", 2.5, false),
        new Pompelmoes("Rode pompelmoes", 3.3, "rood"),
        new Pompelmoes("Witte pompelmoes", 2.9, "wit"),
    };

    public static void main(String[] args) {
        FruitLijst fruitLijst = new FruitLijst();

        for (Fruit fruit : fruitsoorten) {
            fruitLijst.add(fruit);
        }
        fruitLijst.sorteerVolgensPrijs();
        fruitLijst.toon();
    }
}

/*
Persappelsien        €2,50 persappelsien
Witte pompelmoes     €2,90 wit
Algarve              €3,00
Roze pompelmoes      €3,10 roze
Jaffa                €3,20 eetappelsien
Rode pompelmoes      €3,30 rood
Bloedappelsien       €3,40 eetappelsien
*/