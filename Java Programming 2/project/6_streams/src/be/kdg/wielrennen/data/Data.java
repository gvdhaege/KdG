package be.kdg.wielrennen.data;

import be.kdg.wielrennen.model.Discipline;
import be.kdg.wielrennen.model.WielRenner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Data {
    private static List<WielRenner> data = new ArrayList<>();

    public static List<WielRenner> getData() {
        data.add(new WielRenner("Benoot", "Tiesj", "BELG",
                LocalDate.of(1994, 3, 11), 190, 72.0, "Lotto Soudal", Discipline.RACE));
        data.add(new WielRenner("Wellens", "Tim", "BELG",
                LocalDate.of(1991, 5, 10), 183, 65.0, "Lotto Soudal", Discipline.RACE));
        data.add(new WielRenner("Zdeněk", "Štybar", "TJSECHS",
                LocalDate.of(1985, 12, 11), 183, 78.0, "Quick-Step Floors", Discipline.RACE));
        data.add(new WielRenner("Sagan", "Peter", "SLOWAAKS",
                LocalDate.of(1990, 1, 26), 184, 73.4, "BORA - Hansgrohe", Discipline.RACE));
        data.add(new WielRenner("Van Aert", "Wout", "BELG",
                LocalDate.of(1994, 9, 15), 189, 73.0, "Veranda's Willems - Crelan", Discipline.CYCLOCROSS));
        data.add(new WielRenner("Schurter", "Nino", "ZWITSER",
                LocalDate.of(1986, 5, 13), 173, 66.0, "Scott - SRAM", Discipline.MTB));
        data.add(new WielRenner("Kulhavý", "Jaroslav", "TJSECHS",
                LocalDate.of(1985, 1, 8), 187, 76.0, "Specialized Factory Racing", Discipline.MTB));
        data.add(new WielRenner("Fumic", "Manuel", "DUITS",
                LocalDate.of(1982, 3, 30), 174, 65.0, "Cannondale Factory Racing", Discipline.MTB));
        data.add(new WielRenner("Evans", "Kyle", "BRIT",
                LocalDate.of(1993, 9, 26), 180, 81.0, "BTech", Discipline.BMX));
        data.add(new WielRenner("Glaetzer", "Matthew", "AUSTRALISCH",
                LocalDate.of(1992, 8, 24), 190, 86.0, "Australian National Team", Discipline.PISTE));
        data.add(new WielRenner("Greipel", "André", "DUITS",
                LocalDate.of(1982, 7, 16), 184, 82.0, "Lotto Soudal", Discipline.RACE));
        data.add(new WielRenner("van der Poel", "Mathieu", "NEDERLANDS",
                LocalDate.of(1995, 1, 19), 182, 67.0, "Corendon Circus", Discipline.CYCLOCROSS));
        data.add(new WielRenner("Cavendish", "Marc", "BRIT",
                LocalDate.of(1985, 5, 21), 175, 75.0, "Team Dimension Data", Discipline.RACE));
        data.add(new WielRenner("Kristoff", "Alexander", "NOORS",
                LocalDate.of(1987, 7, 5), 181, 78.0, "UAE Team Emirates", Discipline.RACE));
        data.add(new WielRenner("Pauwels", "Kevin", "BELG",
                LocalDate.of(1984, 4, 12), 175, 60.0, "Marlux Napoleon Games", Discipline.CYCLOCROSS));
        data.add(new WielRenner("van der Haar", "Lars", "NEDERLANDS",
                LocalDate.of(1991, 7, 23), 169, 58.0, "Telenet Fidea Lions", Discipline.CYCLOCROSS));
        return Collections.unmodifiableList(data);
    }
}
