package be.kdg.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25/10/2014 19:47
 */
public class DateTimeUtil {
    public static String toLocalDateFormat(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return formatter.format(date);
    }

    public static String toLocalDateFullFormat(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
        return formatter.format(date);
    }
}
