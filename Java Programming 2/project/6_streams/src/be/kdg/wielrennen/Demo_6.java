package be.kdg.wielrennen;

import be.kdg.wielrennen.data.Data;
import be.kdg.wielrennen.model.WielRenner;
import be.kdg.wielrennen.model.WielRenners;
import be.kdg.wielrennen.util.Functions;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Demo_6 {
    public static void main(String[] args) {
        List<WielRenner> data = Data.getData();
        WielRenners wielRenners = new WielRenners();

        System.out.println("Wielrenners data:");
        data.forEach(wielRenners::voegToe);
        data.forEach(System.out::println);

        System.out.println();
        List<WielRenner> lijstVolgensVoornaam = wielRenners.sorteerOp(WielRenner::getVoornaam);
        System.out.println("Wielrenners gesorteerd op voornaam:");
        for (WielRenner wielRenner : lijstVolgensVoornaam) {
            System.out.println(wielRenner);
        }

        System.out.println();
        List<WielRenner> lijstVolgensPloeg = wielRenners.sorteerOp(WielRenner::getPloeg);
        System.out.println("Wielrenners gesorteerd op ploeg:");
        lijstVolgensPloeg.forEach(System.out::println);


        System.out.println();
        List<WielRenner> filteredOpLengte = Functions.filteredList(data, wielRenner -> wielRenner.getLengte() > 180);
        System.out.println("Wielrenners gefilterd op lengte groter dan 180cm:");
        filteredOpLengte.forEach(System.out::println);

        System.out.println();
        List<WielRenner> filteredOpGewicht = Functions.filteredList(data, wielRenner -> wielRenner.getGewicht() < 70.0);
        System.out.println("Wielrenners gefilterd op gewicht lichter dan 70kg:");
        filteredOpGewicht.forEach(System.out::println);

        System.out.println();
        Double gemiddeldeLengte = Functions.averageCollection(data, WielRenner::getLengte);
        System.out.printf("Wielrenners gemiddelde lengte: %.1f", gemiddeldeLengte);

        System.out.println();
        Double gemiddeldGewicht = Functions.averageCollection(data, WielRenner::getGewicht);
        System.out.printf("Wielrenners gemiddeld gewicht: %.1f", gemiddeldGewicht);

        System.out.println();
        long aantalLottoSoudal = Functions.countIf(data, wielRenner -> wielRenner.getPloeg().equalsIgnoreCase("Lotto Soudal"));
        System.out.printf("Aantal wielrenners Lotto Soudal: %d", aantalLottoSoudal);

        System.out.println();
        long aantalBelgen = Functions.countIf(data, wielRenner -> wielRenner.getNationaliteit().equalsIgnoreCase("BELG"));
        System.out.printf("Aantal Belgische wielrenners: %d", aantalBelgen);

        System.out.println();
        Long geborenNa1990 = data
                .stream()
                .filter(e -> e.getGeboorteDatum().isAfter(LocalDate.of(1990, 1, 1)))
                .count();
        System.out.println("Aantal wielrenners geboren na 1990: " + geborenNa1990);

        System.out.println("\nWielrenners gesorteerd op nationaliteit, vervolgens op gewicht:");
        data
                .stream()
                .sorted(Comparator.comparing(WielRenner::getNationaliteit).thenComparing(WielRenner::getGewicht))
                .forEach(System.out::println);

        String nationaliteiten = data
                .stream()
                .map(WielRenner::getNationaliteit)
                .distinct()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining(", "));
        System.out.println("\nAlle ploegen in hoofdletters, omgekeerd gesorteerd en zonder dubbels: " + nationaliteiten);


        //opdracht 3.4
        Optional<WielRenner> anyWielRenner = data.stream()
                .filter(e -> e.getLengte() > 187)
                .findAny();

        if (anyWielRenner.isPresent()) {
            String temp = "\nWielrenner dewelke groter dan 187cm is: " +
                    anyWielRenner.get().getNaam() +
                    " " +
                    anyWielRenner.get().getVoornaam() +
                    " " +
                    anyWielRenner.get().getLengte() + "cm.";
            System.out.println(temp);
        } else {
            System.out.println("Geen wielrenner gevonden dewelke groter dan 187cm is.");
        }

        //opdracht 3.5
        Optional<WielRenner> maxGewicht = data.stream().max(Comparator.comparingDouble(WielRenner::getGewicht));

        if (maxGewicht.isPresent()) {
            String temp = "\nDe zwaarste wielrenner uit de lijst is: " +
                    maxGewicht.get().getNaam() +
                    " " +
                    maxGewicht.get().getVoornaam() +
                    " met een gewicht van " +
                    maxGewicht.get().getGewicht() + "kg.";
            System.out.println(temp);
        }

        //opdracht 3.6
        List<WielRenner> wielrennersLetterA = data.stream()
                .filter(a -> a.getNaam().substring(0, 1).equalsIgnoreCase("v"))
                .sorted(Comparator.comparing(WielRenner::getVoornaam))
                .collect(Collectors.toList());
        System.out.println("\nLijst van gesorteerde wielrenners dewelke hun naam begint met een 'V': ");
        System.out.println(wielrennersLetterA);

        //opdracht 3.7
        Map<Boolean, List<WielRenner>> map = data.stream()
                .sorted(Comparator.comparing(WielRenner::getLengte))
                .collect(Collectors.partitioningBy(e -> e.getLengte() <= 180));


        List<WielRenner> lijstKlein = map.get(true);
        List<WielRenner> lijstGroot = map.get(false);

        System.out.println("\nLijst van wielrenners kleiner dan of exact 180cm: ");
        lijstKlein.forEach(System.out::println);

        System.out.println("\nLijst van wielrenners groter dan 180cm: ");
        lijstGroot.forEach(System.out::println);
    }
}
