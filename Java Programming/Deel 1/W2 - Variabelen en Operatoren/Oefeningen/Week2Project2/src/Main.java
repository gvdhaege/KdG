public class Main
{
    public static void main(String[] args)
    {
        /*
        // WERKEN MET VARIABELEN
        // ASSIGNMENT of TOEKENNING.
        //

        // Declaratie met type en naam.
        int number;

        // Assignment.
        number = 45;
        System.out.println("number na assignment = " + number);

        // Nieuw assignment.
        number = 145;
        System.out.println("number na nieuw assignment = " + number);

        // Assignment van het resultaat van een som.
        // Eerst de right hand side (RHS) uitwerken.
        // Dan het resultaat toekennen aan de left hand side (LHS).
        number = number + 55;
        System.out.println("assignment van een som = " + number);

        // Shorthand notations
        float floatNumber = 0;
        floatNumber += 25;       // som en assignment met 1 symbool.
        System.out.println("number na shorthand som = " + floatNumber);
        floatNumber -= 10;       // verschil en assignment met 1 symbool.
        System.out.println("number na shorthand verschil = " + floatNumber);
        floatNumber *= 5;        // product en assignment met 1 symbool.
        System.out.println("number na shorthand product = " + floatNumber);
        floatNumber /= 10;       // deling en assignment met 1 symbool.
        System.out.println("number na shorthand deling = " + floatNumber);
        */

        /*
        // REKENEN met variabelen.
        //
        // Overzicht van operatoren, zie slides.
        //
        // Syntax
        //          variabele = operand operator operand;
        //            number  =    35       +       10;

        int number;
        number = 35 + 10;
        System.out.println("number = 35 + 10\t\t\t\tgeeft " + number);

        //
        // Increase en decrease
        number = 10;
        System.out.println("number = 10\t\t\t\t\t\tgeeft " + number);
        number++;
        System.out.println("number++\t\t\t\t\t\tgeeft " + number);
        number--;
        System.out.println("number--\t\t\t\t\t\tgeeft " + number);
        // Speciaal : plaats van ++ en -- operator heeft belang.
        //
        // Als ++ en -- na de naam van de variabele volgt, wordt eerst de huidige waarde van de variable terugggeven,
        // en dan pas die waarde verhoogd/verlaagd met 1.
        // Als ++ en -- voor de naam van de variabele staat, wordt eerst de huidige waarde van de variable verhoogd
        // met, en dan pas de waarde teruggegeven.
        number = 10;
        System.out.println("Plaats van operator : number++\tgeeft " + number++);
        number = 10;
        System.out.println("Plaats van operator : ++number\tgeeft " + ++number);
        */

        /*
        // Rest bij deling = modulo operator, wordt veel gebruikt.
        //
        int number = 18;
        int rest = number % 5;
        System.out.println("18 % 5\t\tgeeft " + rest);
        //
        // Rest bij deling van de eerste 20 getallen gedeeld door 3.
        // Gebruik van een forloop (vergelijkbaar met een while loop).
        for (
            int i=0;    // Beginsituatie
            i < 21;     // Stopconditie
            i++         // Statement dat wordt uitgevoerd na elke herhaling
            )
        {
            System.out.println(i + " gedeeld door 3\t= " + i / 3 + " Rest =\t" + i % 3);
        }
        */

        /*
        // RELATIONELE Operatoren : variabelen vergelijken.
        //
        // Overzicht van operatoren, zie slide 34.
        // Resultaat = boolean -> slechts 2 mogelijke waarden : false of true.
        //
        int number1 = 25;
        int number2 = 30;
        boolean resultaat = false;
        resultaat = number1 > number2;
        System.out.println("resultaat van number1 > number2\t\t\t\t\t\tgeeft " + resultaat);
        resultaat = number1 < number2;
        System.out.println("resultaat van number1 < number2\t\t\t\t\t\tgeeft " + resultaat);
        resultaat = number1 == number2;
        System.out.println("resultaat van number1 == number2\t\t\t\t\tgeeft " + resultaat);
        number1 = 10;
        number2 = 10;
        resultaat = number1 <= number2;
        System.out.println("resultaat van number1 <= number2\t\t\t\t\tgeeft " + resultaat);
        resultaat = number1 >= number2;
        System.out.println("resultaat van number1 >= number2\t\t\t\t\tgeeft " + resultaat);

        // Logische operatoren : combinaties van booleans, zie slides.
        // Zie ook vak computerarchitectuur (waarheidstabellen).
        number1 = 25;
        number2 = 30;
        resultaat = number1 > 20 && number2 > 35;   // AND
        System.out.println("resultaat van number1 > 20 && number2 > 35\t\t\tgeeft " + resultaat);
        // Gebruik van haakjes, in twijfelgevallen:
        resultaat = ((number1 > 20) && (number2 > 35));
        System.out.println("resultaat van ((number1 > 20) && (number2 > 35))\tgeeft " + resultaat);
        resultaat = number1 > 20 || number2 > 35;   // OR
        System.out.println("resultaat van number1 > 20 || number2 > 35\t\t\tgeeft " + resultaat);
        */
    }
}
