package be.kdg;

import be.kdg.blackjack.BlackJack;

import java.util.Scanner;

/*
Gebruik deze klasse om de werking van de overige klassen te testen.
 */
public class SpeelBlackJack {
    private static final String STOP = "S";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlackJack blackJack = new BlackJack();
        String keuze;

        System.out.println("BLACKJACK! Probeer 21 te bereiken.");
        do {
            System.out.print("Tik in D(Deal), H(Hold) of S(Stop): ");
            keuze = scanner.nextLine();
            keuze = keuze.toUpperCase();
            if (!keuze.equals(STOP)) {
                blackJack.speel(keuze.charAt(0));
            }
        } while (!keuze.equals(STOP));
    }
}

/* mogelijke uitvoer

BLACKJACK! Probeer 21 te bereiken.
Tik in D(Deal), H(Hold) of S(Stop): d
schoppen 4
klaveren aas
Tik in D(Deal), H(Hold) of S(Stop): d
harten 7
Jammer: je bent verloren met 22 punten.

Tik in D(Deal), H(Hold) of S(Stop): d
ruiten heer
schoppen 3
Tik in D(Deal), H(Hold) of S(Stop): d
klaveren 8
PROFICIAT!

Tik in D(Deal), H(Hold) of S(Stop): d
harten boer
schoppen 2
Tik in D(Deal), H(Hold) of S(Stop): d
ruiten boer
Jammer: je bent verloren met 22 punten.

Tik in D(Deal), H(Hold) of S(Stop): d
harten 6
klaveren dame
Tik in D(Deal), H(Hold) of S(Stop): h
Totaal: 16 punten.

Tik in D(Deal), H(Hold) of S(Stop): d
harten aas
harten heer
PROFICIAT!

Tik in D(Deal), H(Hold) of S(Stop): s
*/