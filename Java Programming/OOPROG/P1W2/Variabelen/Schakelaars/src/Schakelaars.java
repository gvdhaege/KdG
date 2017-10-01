import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 1/10/2017 18:43
 */
public class Schakelaars {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int counter = 0;

        while (counter <= 4){
            System.out.print("Geef de toestand van schakelaar 1 (true or false): ");
            boolean schakelaarEen = keyboard.nextBoolean();
            System.out.print("Geef de toestand van schakelaar 2 (true or false): ");
            boolean schakelaarTwee = keyboard.nextBoolean();
            System.out.print("Geef de toestand van schakelaar 3 (true or false): ");
            boolean schakerlaarDrie = keyboard.nextBoolean();

            if ((schakelaarEen && schakelaarTwee) || (schakelaarTwee && schakerlaarDrie) || (schakerlaarDrie && schakelaarEen)) {
                System.out.println("Er zijn minstens 2 schakelaars aan.");
            }
            if ((schakelaarEen && schakelaarTwee && !schakerlaarDrie) || (schakelaarEen && !schakelaarTwee && schakerlaarDrie) || (!schakelaarEen && schakelaarTwee && schakerlaarDrie)){
                System.out.println("Er zijn exact 2 schakelaars aan.");
            }
            if (!schakelaarEen && !schakelaarTwee && !schakerlaarDrie || schakelaarEen && !schakelaarTwee && !schakerlaarDrie || !schakelaarEen && !schakelaarTwee && schakerlaarDrie || !schakelaarEen && schakelaarTwee && !schakerlaarDrie){
                System.out.println("Er staat maximaal 1 schakelaar aan.");
            }
            counter++;
        }
    }
}
