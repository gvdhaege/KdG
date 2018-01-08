package be.kdg;

import be.kdg.bewerkingen.Bewerkingen;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
  Voeg aan dit programma een lus toe waarbij bij foutieve invoer de invoer opnieuw gevraagd wordt.
  Vang ook de exceptions InputMismatchException en ArithmeticException met een foutmelding op.
  Zie ook de gewenste uitvoer hierna.
 */

public class TestBewerkingen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean invoerFout = true;
        do {
            try {
                System.out.print("\nGeef een geheel getal: ");
                int getalEen = scanner.nextInt();
                System.out.print("Geef een geheel getal: ");
                int getalTwee = scanner.nextInt();

                Bewerkingen bewerkingen = new Bewerkingen(getalEen, getalTwee);
                bewerkingen.doeBewerkingen(); // throw RuntimeException?
                bewerkingen.toonResultaat();
                invoerFout = false;
            } catch (InputMismatchException e) {
                scanner.nextLine(); // leesbuffer leegmaken
                System.out.println("Je moet 2 gehele getallen ingeven!");
            } catch (ArithmeticException e) {
                scanner.nextLine(); // leesbuffer leegmaken
                System.out.println("Het tweede getal mag niet 0 zijn!");
            }
            /**  Alternatief
            catch (RuntimeException ex) { // vangt alle RuntimeExceptions op!
                scanner.nextLine(); // leesbuffer leegmaken
                if (ex instanceof InputMismatchException) {
                    System.out.println("Je moet 2 gehele getallen ingeven!");
                } else if (ex instanceof  ArithmeticException) {
                    System.out.println("Het tweede getal mag niet 0 zijn!");
                } else {
                    System.out.println("Onverwachte fout!");
                }
            }
            **/
        } while (invoerFout);
    }
}

/*
Geef een geheel getal: 3
Geef een geheel getal: 0
Het tweede getal mag niet 0 zijn!

Geef een geheel getal: 4,5
Je moet 2 gehele getallen ingeven!

Geef een geheel getal: 4.5
Je moet 2 gehele getallen ingeven!

Geef een geheel getal: 4.0
Je moet 2 gehele getallen ingeven!

Geef een geheel getal: abc
Je moet 2 gehele getallen ingeven!

Geef een geheel getal: 6
Geef een geheel getal: 4
Som:           10
Verschil:      2
Product:       24
Quotiënt:      1
*/





