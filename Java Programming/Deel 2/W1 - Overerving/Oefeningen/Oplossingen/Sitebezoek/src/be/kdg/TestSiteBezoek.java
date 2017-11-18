package be.kdg;


import be.kdg.sitebezoek.Verdeling;

public class TestSiteBezoek {
    public static void main(String[] args) {
        Verdeling verdeling = new Verdeling();
        verdeling.genereerBezoekersTijden();
        verdeling.voegBezoekersTijdenToe();

        System.out.println("Verdeling:");
        System.out.println(verdeling.toonVerdeling());

        System.out.println("Totaal aantal bezoekers: " + verdeling.getControleTotaal());
        System.out.printf("Eerste om %-12s\n",  verdeling.vroegste());
        System.out.printf("Laatste om %-11s\n ",  verdeling.laatste());
    }
}

/*
Verdeling:
uur  0: 37   uur 12: 45
uur  1: 47   uur 13: 39
uur  2: 41   uur 14: 42
uur  3: 46   uur 15: 51
uur  4: 48   uur 16: 31
uur  5: 38   uur 17: 44
uur  6: 34   uur 18: 35
uur  7: 34   uur 19: 41
uur  8: 50   uur 20: 49
uur  9: 39   uur 21: 52
uur 10: 36   uur 22: 42
uur 11: 36   uur 23: 43

Totaal aantal bezoekers: 1000
Eerste om  0:00:23.22
Laatste om 23:59:28.89
*/