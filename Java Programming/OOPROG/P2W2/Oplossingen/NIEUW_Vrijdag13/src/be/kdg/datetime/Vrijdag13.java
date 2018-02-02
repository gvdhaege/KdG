package be.kdg.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25/10/2014
 *
 * Druk alle vrijdag de 13de tussen 1 januari 2010 en 31 december 2019 af.
 */
public class Vrijdag13 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2010, 1, 13);
        LocalDate endDate = LocalDate.of(2019, 12, 31);
        System.out.println("Alle maanden waarbij de 13de op een vrijdag valt:");
        do {
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM yyyy");
                System.out.println(formatter.format(date));
            }
            date = date.withDayOfMonth(13).plusMonths(1);
        } while (date.isBefore(endDate));
    }
}

/*
Alle maanden waarbij de 13de op een vrijdag valt:
aug 2010
mei 2011
jan 2012
apr 2012
jul 2012
sep 2013
dec 2013
jun 2014
feb 2015
mrt 2015
nov 2015
mei 2016
jan 2017
okt 2017
apr 2018
jul 2018
sep 2019
dec 2019
 */