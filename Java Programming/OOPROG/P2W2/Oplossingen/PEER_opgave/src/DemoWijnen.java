import wijnen.*;

/**
 * Mark Goovaerts
 * Datum: 4-11-13
 * Johan Ven
 * Datum: 10-11-14
 */
public class DemoWijnen {
    public static void main(String[] args) {
        /*
        //Controle na deel 1:
        //enkele testwijnen aanmaken:
        Wijn w1 = new Wijn("Gelso Nero", "Puglia", 2010, 9.95);
        Wijn w2 = new Wijn("Barbera di Alba", "Piemonte", 2012, 10.50);
        Wijn w3 = new Wijn("Gelso di Oro", "Puglia", 2010, 22);
        Wijn w4 = new Wijn("Toscana Rosso", "Toscana", 2010, 6.95);
        Wijn w5 = new Wijn("Montefreddo", "Emilia Romagna", 2011, 8.95);

        System.out.println("=== CONTROLE NA BASISOPDRACT 1 ===");
        //controle getKenmerken
        System.out.println(w1.getKenmerken());

        //toString oproepen en afdrukken:
        System.out.println(w1.toString());
        System.out.println(w2.toString());
        System.out.println(w3.toString());
        System.out.println(w4.toString());
        System.out.println(w5.toString());

        */
        /*
        //Controle na deel 2:
        System.out.println("=== CONTROLE NA BASISOPDRACT 2 ===");
        Wijn w6 = new Likeur("Amaretto", "Italia", 2004, 42.50, 0.29);
        Wijn w7 = new Likeur("Elixir d'Anvers", "Belgium", 2010, 32, 0.52);
        //toString oproepen en afdrukken:
        System.out.println(w7.toString());
        */
        /*
        //Controle na deel 3 en 4:
        System.out.println("=== CONTROLE NA BASISOPDRACT 3 en 4 ===");
        Wijn w8 = new Champagne("Lancelot Reserve", "Cramant", 2012, 18.20, Smaak.EXTRA_BRUT);
        Wijn w9 = new Champagne("Lancelot Chevalier", "Cramant", 2013, 17.60, Smaak.BRUT);
        Wijn w10 = new Champagne("Bandock Des Lys", "Reims", 2011, 17, Smaak.DOUX);
        Wijn w11 = new Wijn("Zuidflank", "Limburg", 2013, 21);
        //toString oproepen en afdrukken:
        System.out.println(w8.toString());
        System.out.println(w9.toString());
        System.out.println(w10.toString());
        */
        /*
        //Controle na deel 5:
        System.out.println("=== CONTROLE NA OPGAVE 5.1 en 5.2 ===");
        //wijnhuis aanmaken:
        WijnHuis wh = new WijnHuis("Legras & Haas");

        //wijnhuis bevoorraden:
        wh.voegWijnToe(w1);
        wh.voegWijnToe(w2);
        wh.voegWijnToe(w3);
        wh.voegWijnToe(w4);
        wh.voegWijnToe(w5);
        wh.voegWijnToe(w6);
        wh.voegWijnToe(w7);
        wh.voegWijnToe(w8);
        wh.voegWijnToe(w9);
        wh.voegWijnToe(w10);
        wh.voegWijnToe(w11);

        //wijnen opzoeken:
        System.out.println("\nOp zoek naar wijnen:");
        System.out.println("Lancelot Chevalier: " + wh.zoekWijn(w9));
        System.out.println("Zuidflank: " + wh.zoekWijn(w11));

        //wijnhuis afdrukken:
        System.out.println("=== CONTROLE NA OPGAVE 5.3 ===");
        System.out.println(wh);
        */
    }
}

/* Verwachte afdruk:
=== CONTROLE NA BASISOPDRACT 1 ===
Van 2010, afkomstig uit Puglia
Gelso Nero                                    €   9,95
 (Van 2010, afkomstig uit Puglia)
Barbera di Alba                               €  10,50
 (Van 2012, afkomstig uit Piemonte)
Gelso di Oro                                  €  22,00
 (Van 2010, afkomstig uit Puglia)
Toscana Rosso                                 €   6,95
 (Van 2010, afkomstig uit Toscana)
Montefreddo                                   €   8,95
 (Van 2011, afkomstig uit Emilia Romagna)
=== CONTROLE NA BASISOPDRACT 2 ===
Elixir d'Anvers                               €  40,00
 (Van 2010, afkomstig uit Belgium) => alc 52%
=== CONTROLE NA BASISOPDRACT 3 en 4 ===
Lancelot Reserve                              €  20,02
 (Van 2012, afkomstig uit Cramant)
 (Type Extra-brut)
Lancelot Chevalier                            €  19,36
 (Van 2013, afkomstig uit Cramant)
 (Type Brut)
Bandock Des Lys                               €  17,00
 (Van 2011, afkomstig uit Reims)
 (Type Doux)

=== CONTROLE NA OPGAVE 5.2 ===
Op zoek naar wijnen:
Lancelot Chevalier: true
Zuidflank: false
=== CONTROLE NA OPGAVE 5.3 ===
Wijnhuis LEGRAS & HAAS
Wijnen:
	Gelso Nero                                    €   9,95   (Van 2010, afkomstig uit Puglia)
	Barbera di Alba                               €  10,50   (Van 2012, afkomstig uit Piemonte)
	Gelso di Oro                                  €  22,00   (Van 2010, afkomstig uit Puglia)
	Toscana Rosso                                 €   6,95   (Van 2010, afkomstig uit Toscana)
	Montefreddo                                   €   8,95   (Van 2011, afkomstig uit Emilia Romagna)

Champagnes:
	Lancelot Reserve                              €  20,02   (Van 2012, afkomstig uit Cramant)   (Type Extra-brut)
	Lancelot Chevalier                            €  19,36   (Van 2013, afkomstig uit Cramant)   (Type Brut)
	Bandock Des Lys                               €  17,00   (Van 2011, afkomstig uit Reims)   (Type Doux)

Likeuren:
	Amaretto                                      €  42,50   (Van 2004, afkomstig uit Italia) => alc 28%
	Elixir d'Anvers                               €  40,00   (Van 2010, afkomstig uit Belgium) => alc 52%

*/
