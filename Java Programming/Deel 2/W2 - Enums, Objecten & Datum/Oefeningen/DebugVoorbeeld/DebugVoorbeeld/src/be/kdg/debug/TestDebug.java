package be.kdg.debug;

import java.time.LocalDateTime;
import java.util.Scanner;

public class TestDebug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een klein geheel getal: ");
        int getal = scanner.nextInt();
        long faculteit = Faculteit.faculteit(getal);
        System.out.println(getal + "! = " + faculteit);
        LocalDateTime
    }
}
