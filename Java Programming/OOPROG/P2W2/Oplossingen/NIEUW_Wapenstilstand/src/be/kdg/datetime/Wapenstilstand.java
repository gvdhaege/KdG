package be.kdg.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25/10/2014
 *
 * Geef de dag waarop wapenstilstand (11 november 1918) viel.
 * Stop alle jaren in de range 1980..2040 waarin wapenstilstand op een zondag valt in een tabel.
 * Een lengte van 10 voor de tabel volstaat. Druk daarna de waarden in de tabel op één regel af.
 */
public class Wapenstilstand {
    public static void main(String[] args) {
        LocalDate wapenstilstand = LocalDate.of(1918, Month.NOVEMBER, 11);
        String dag = wapenstilstand.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        System.out.println("Wapenstilstand was op een " + dag);

        int[] jaren = new int[10];
        int count = 0;
        for (int i = 1980; i < 2041; i++) {
            int value = LocalDate.of(i, Month.NOVEMBER, 11).getDayOfWeek().getValue();
            if (value == DayOfWeek.SUNDAY.getValue()) {
               jaren[count++] = i;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(jaren[i] + " ");
        }
    }
}

/*
Wapenstilstand was op een maandag
1984 1990 2001 2007 2012 2018 2029 2035 2040
 */