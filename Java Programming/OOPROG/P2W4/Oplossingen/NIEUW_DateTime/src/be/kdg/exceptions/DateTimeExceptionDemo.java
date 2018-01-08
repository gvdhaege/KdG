package be.kdg.exceptions;

import java.time.DateTimeException;
import java.time.Month;

/**
 * @author Kristiaan Behiels
 * @version 1.0 1/12/2014 20:09
 */
public class DateTimeExceptionDemo {
    public static void main(String[] args) {
        try {
            MyLocalDateTime foutUur = new MyLocalDateTime(2014, 12, 6, 25, 0, 0);
        } catch(DateTimeException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            MyLocalDateTime fouteSeconden = new MyLocalDateTime(2014, Month.DECEMBER, 6, 23, 59, 60);
        } catch(DateTimeException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            MyLocalDateTime geenSchrikkeljaar = new MyLocalDateTime(2014, Month.FEBRUARY, 29);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            MyLocalDateTime fouteDatum = new MyLocalDateTime(2014, 11, 31);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}

/*
Invalid value for HourOfDay (valid values 0 - 23): 25
Invalid value for SecondOfMinute (valid values 0 - 59): 60
java.time.DateTimeException: Invalid date 'February 29' as '2014' is not a leap year
java.time.DateTimeException: Invalid date 'NOVEMBER 31'
*/