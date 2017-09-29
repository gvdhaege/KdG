import java.util.Scanner;

/**
 * @author Steven Excelmans
 * @version 1.0 29/09/2017 17:57
 */
public class Pizza {

    public static void main(String[] args) {

        final int pizzaPrijs = 800;
        final int pizzaTopping = 50;

        double totaal = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hoeveel pizza's wens je? ");
        int aantalPizzas = keyboard.nextInt();
        int counter = 1;
        if (aantalPizzas > 0){
            while(counter <= aantalPizzas){
                System.out.print("Hoeveel extra toppings voor pizza " + counter + ": ");
                int aantalToppings = keyboard.nextInt();
                if (aantalToppings > 0){
                    totaal += pizzaPrijs + (pizzaTopping * aantalToppings);
                } else {
                    totaal += pizzaPrijs;
                }
                counter++;
            }
            System.out.print("Te betalen: €");
            System.out.printf("%.1f", (totaal / 100));
        }
    }
}
