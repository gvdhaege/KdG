package be.kdg.input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);
        int i = 1;

        boolean inputOk = false;
        do {
            try {
                System.out.print("Geef een getal van 1 tot en met 10: ");
                i = keyboard.nextInt();
                if (i < 1 || i > 10) {
                    throw new InputMismatchException(i + " is geen getal van 1 tot en met 10.");
                }
                else {
                    inputOk = true;
                }
            } catch (final InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (!inputOk);

        System.out.println(i + " is een goed getal!");
    }
}
