package be.kdg.datetime;

import java.time.LocalDate;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25/10/2014
 */
public class DemoUtil {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.of(2014, 10, 25);

        System.out.println(DateTimeUtil.toLocalDateFormat(now));
        System.out.println(DateTimeUtil.toLocalDateFullFormat(date));

    }
}
