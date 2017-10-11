import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Geef een zin in: ");
        String zin = keyboard.nextLine();
        System.out.printf("De zin heeft een lengte van %d karakters. %n", zin.length());
        System.out.println(zin.toUpperCase());
        System.out.println(zin.toLowerCase());
        System.out.printf("eerste letter: %c %n", zin.charAt(0));
        System.out.printf("laatste letter: %c %n", zin.charAt(zin.length() - 1));
        System.out.println(zin.substring(0, zin.length() / 2));
        System.out.println(zin.replace('o', '_'));
        System.out.println(zin.replaceAll("\\s",""));
        System.out.println(zin.replaceAll("a|e|i|o|u|A|E|I|O|U", ""));
    }
}


