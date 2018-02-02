package be.kdg;

import be.kdg.replace.SortAndReplace;
import java.util.Scanner;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */

public class TestSortAndReplace {
    public static void main(String[] args) {
         boolean einde = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("\nGeef een string (stop met <enter>): ");
            String string = scanner.nextLine();
            if (!string.isEmpty()) {
                SortAndReplace replace = new SortAndReplace(string);
                System.out.println(replace);
            } else {
                einde = true;
            }
        } while (!einde);
    }
}

/*
Geef een string (stop met <enter>): Hoogstraat 17, 2000 Antwerpen
   ,......AHaaeegnnooprrstttw

Geef een string (stop met <enter>): the quick brown fox jumps over the lzay dog
        abcdeeefghhijklmnoooopqrrsttuuvwxyz

Geef een string (stop met <enter>): 1 januari 2013 tot 31 december 2015
      ...........aabcdeeeijmnorrttu

Geef een string (stop met <enter>):
*/