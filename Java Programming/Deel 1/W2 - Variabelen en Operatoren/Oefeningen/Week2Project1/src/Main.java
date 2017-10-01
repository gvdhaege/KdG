import java.util.Scanner;

public class Main
{
    // Bestudeer deze source code met de slides ernaast. Zoek alle begrippen die je niet begrijpt op in de slides.
    //
    // De source code hieronder is opgebouwd in blokken die aangeven worden door de commentaar symbolen /* en */.
    // Verander /* en */ in //, en je zal zien dat de source code actief wordt. Nu kan je dit stuk runnen.
    //
    // Alle source code wordt in classes gezet : zie vorige week.
    //
    // In een class kan je zelf commando's definiëren = methods.
    // De method 'main' = het startpunt van je programma. Java kent het keyword 'main'.

    // public   : wil zeggen dat andere classes deze method kunnen zien, en dat je ze dus in die andere classes kan gebruiken.
    // static   : wil zeggen dat er maar 1 main method per class bestaat (zie later).
    // void     : bepaalt het return type van de method. De betekenis van het woord 'void' is 'leeg',
    //            dus deze method geeft niets terug, voert alleen maar iets uit.
    // (        : een method kan argumenten meekrijgen waar ze iets mee kan doen.
    //            '(' begint de lijst van argumenten.
    //          : de main method verwacht een lijst van Strings, met naam 'args' : String[] args (zie later).
    // )        : ')' sluit de lijst van argumenten.

    public static void main(String[] args)
    {
//        /* VARIABELEN : herhaling van vorige week.
        //
        // Een variable is een stuk geheugen waar je een waarde kan in bewaren.
        // int      : het type van de variable.
        // number   : de naam van de variable. Deze naam kies je zelf.
        // = 0      : initialisatie. Je zet de waarde van number op 0 als startwaarde.

        int number = 0;  // Declaratie + initialisatie

        // Getallen inlezen van het klavier.
        //
        // 'keyboard' is ook een variabele, maar dan van class of type 'Scanner'.
        // In de class 'Scanner' zijn er methods voorgeprogrammeerd die je kan gebruiken.
        //
        // Hier gebruiken we de method 'nextInt()' om een getal in te lezen.
        // Het resultaat wordt in de variabele met naam 'number' gestoken.

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef een getal in: ");
        number = keyboard.nextInt();

        // De ingelezen waarde wordt naar het scherm gestuurd.
        System.out.println("number = " + number);
//        */

//        /* STRINGS EN CHARACTERS
        //
        // In het volgende statement wordt er een String literal (ook String constante genoemd) getoond.
        // Die literal bestaat uit characters volgens de ascii codes, zie slides.

        System.out.println("Dit is een string.");

        // In het volgende commando wordt er een String literal en de waarde van een variabele getoond.
        // Gebruik hiervoor de '+' operator : dit wordt concatenatie (aan elkaar plakken) genoemd.

        int number2 = 100;
        System.out.println("De variable 'number' heeft als waarde : " + number2);

        // Er bestaan ook speciale characters, zie slides.
		// Die worden escape characters genoemd, omdat de \ de gewone betekenis van het volgende character 'escapet'.

        System.out.println("De variable 'number'\nheeft als waarde\t\t: " + number2);
//        */

//        /* CAST : het converteren van 1 type naar een ander type.
        //
        int number3 = 0;             // int staat voor integer of geheel getal.
        float decimal = 10.15f;     // float staat voor floating point number, dat is een commagetal.

        // number = decimal; // Lukt niet, want verlies van informatie na de comma.
        // Je kan dat wel forceren, door te converteren tussen types : cast.
        // Je verliest dan wel de cijfers na de comma.

        number3 = (int) decimal;
        System.out.println("decimal = " + decimal);
        System.out.println("number = " + number3);
//        */
    }
}
