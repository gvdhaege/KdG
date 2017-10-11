import java.util.Scanner;

public class WoordDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Woord woord;

        System.out.print("Geef een woord: ");
        String string = keyboard.nextLine();

        woord = new Woord(string);
        System.out.printf("Je gaf '%s' in. %n", woord.getWoord());
        System.out.printf("Dit woord heeft %d letters %n", woord.aantalLetters());
        System.out.println("Het woord met eerste letter een hoofdletter: " + woord.eersteLetterNaarHoofdletter());
        System.out.println("Het woord in hoofdletters: " + woord.naarHoofdletters());
    }
}
