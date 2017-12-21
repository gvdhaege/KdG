package be.kdg.sorteerbaar;

import be.kdg.sorteerbaar.extra.*;

/**
 * @author Kristiaan Behiels
 * @version 1.0 31/10/13
 */
public class TestSorteerbaar {
    public static void main(String[] args) {
        Persoon[] runaways = {
                new Persoon("Joan Jett", 58),
                new Persoon("Cherie Currie", 53),
                new Persoon("Lita Ford", 55),
                new Persoon("Sandy West", 54),
                new Persoon("Jackie Fox", 53),
        };

        Kampioen[] champions = {
                new Kampioen("Sebastian", "Vettel", "Red Bull"),
                new Kampioen("Jenson", "Button", "Brawn GP"),
                new Kampioen("Kimi", "Räikkönen", "Ferrari"),
                new Kampioen("Fernando", "Alonso", "Renault"),
                new Kampioen("Michael", "Schumacher", "Ferrari"),
                new Kampioen("Mika", "Häkkinen", "McLaren"),
                new Kampioen("Lewis", "Hamilton", "McLaren")
        };

        Sorteerder personen = new Personen(runaways);
        System.out.println("Personen origineel:\n" + personen);
        personen.sort();
        System.out.println("Personen van jong naar oud:\n" + personen);
        personen.sortReversed();
        System.out.println("Personen oud naar jong:\n" + personen);

        Sorteerder kampioenen = new Kampioenen(champions);
        System.out.println("Kampioenen origineel:\n" + kampioenen);
        kampioenen.sort();
        System.out.println("Kampioenen alfabetisch volgens familienaam:\n" + kampioenen);
        kampioenen.sortReversed();
        System.out.println("Kampioenen omgekeerd alfabetisch volgend familienaam:\n" + kampioenen);
    }
}


/*
Personen origineel:
Joan Jett       58
Cherie Currie   53
Lita Ford       55
Sandy West      54
Jackie Fox      53

Personen van jong naar oud:
Cherie Currie   53
Jackie Fox      53
Sandy West      54
Lita Ford       55
Joan Jett       58

Personen oud naar jong:
Joan Jett       58
Lita Ford       55
Sandy West      54
Cherie Currie   53
Jackie Fox      53

Kampioenen origineel:
Sebastian Vettel     Red Bull
Jenson Button        Brawn GP
Kimi Räikkönen       Ferrari
Fernando Alonso      Renault
Michael Schumacher   Ferrari
Mika Häkkinen        McLaren
Lewis Hamilton       McLaren

Kampioenen alfabetisch volgens familienaam:
Fernando Alonso      Renault
Jenson Button        Brawn GP
Lewis Hamilton       McLaren
Mika Häkkinen        McLaren
Kimi Räikkönen       Ferrari
Michael Schumacher   Ferrari
Sebastian Vettel     Red Bull

Kampioenen omgekeerd alfabetisch volgend familienaam:
Sebastian Vettel     Red Bull
Michael Schumacher   Ferrari
Kimi Räikkönen       Ferrari
Mika Häkkinen        McLaren
Lewis Hamilton       McLaren
Jenson Button        Brawn GP
Fernando Alonso      Renault
*/