package be.kdg.exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * @author Kristiaan Behiels
 * @version 1.0 1/12/2014 20:13
 */
public class MyLocalDateTime {
    LocalDateTime datetime;
    LocalDate date;

    public MyLocalDateTime(int jaar, int maand, int dag, int uren, int minuten, int seconden) {
        datetime = LocalDateTime.of(jaar, maand, dag, uren, minuten, seconden);
    }

    public MyLocalDateTime(int jaar, Month maand, int dag, int uren, int minuten, int seconden) {
        datetime = LocalDateTime.of(jaar, maand, dag, uren, minuten, seconden);
    }

    // Convert unchecked exception to checked exception
    public MyLocalDateTime(int jaar, int maand, int dag) throws Exception {
        try {
            date = LocalDate.of(jaar, maand, dag);
        } catch (DateTimeException ex) {
            throw new Exception(ex);
        }
    }

    // Convert unchecked exception to checked exception
    public MyLocalDateTime(int jaar, Month maand, int dag) throws Exception {
        try {
            date = LocalDate.of(jaar, maand, dag);
        } catch (RuntimeException ex) {
            throw new Exception(ex);
        }
    }
}
