package be.kdg.wielrennen.model;

import java.time.LocalDate;
import java.util.Random;

public class WielRennerFactory {
    private static final int MIN_LENGTE = 50;
    private static final int MAX_LENGTE = 250;
    private static final double MIN_GEWICHT = 20.0;
    private static final double MAX_GEWICHT = 150.0;
    private static final String KLINKERS = "aeiou";
    private static final String MEDEKLINKERS = "bcdfghjklmnpqrstvwxyz";

    private WielRennerFactory() {

    }

    public static WielRenner newEmptyWielRenner() {
        return new WielRenner();
    }

    public static WielRenner newFilledWielRenner(String naam, String voornaam, String nationaliteit, LocalDate geboorteDatum,
                                                 int lengte, double gewicht, String ploeg, Discipline discipline) {
        return new WielRenner(naam, voornaam, nationaliteit, geboorteDatum, lengte, gewicht, ploeg, discipline);
    }

    public static WielRenner newRandomWielRenner() {
        Random random = new Random();
        return new WielRenner(
                genereerString(10, false, random),
                genereerString(8, false, random),
                genereerString(9, true, random),
                genereerGeboorteDatum(random),
                genereerLengte(random),
                genereerGewicht(random),
                genereerString(12, false, random),
                genereerDiscipline(random));
    }

    private static String genereerString(int maxLengte, boolean upperCase, Random random) {
        char[] klinkers = KLINKERS.toCharArray();
        char[] medeKlinkers = MEDEKLINKERS.toCharArray();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < maxLengte; i++) {
            int letterKans = random.nextInt(3) + 1;
            char letter;
            if (letterKans == 3) {
                letter = klinkers[random.nextInt(klinkers.length)];
            } else {
                letter = medeKlinkers[random.nextInt(medeKlinkers.length)];
            }
            temp.append(letter);
        }
        return upperCase ? temp.toString().toUpperCase() : temp.toString().substring(0, 1).toUpperCase() + temp.toString().substring(1);
    }

    private static LocalDate genereerGeboorteDatum(Random random) {
        int beginDatum = (int) LocalDate.of(1940, 1, 1).toEpochDay();
        int eindDatum = (int) LocalDate.now().toEpochDay() - 1;
        long randomDatum = beginDatum + random.nextInt(eindDatum - beginDatum);

        return LocalDate.ofEpochDay(randomDatum);
    }

    private static int genereerLengte(Random random) {
        return MIN_LENGTE + random.nextInt(MAX_LENGTE - MIN_LENGTE);
    }

    private static double genereerGewicht(Random random) {
        return MIN_GEWICHT + (MAX_GEWICHT - MIN_GEWICHT) * random.nextDouble();
    }

    private static Discipline genereerDiscipline(Random random) {
        return Discipline.values()[random.nextInt(Discipline.values().length)];
    }
}
