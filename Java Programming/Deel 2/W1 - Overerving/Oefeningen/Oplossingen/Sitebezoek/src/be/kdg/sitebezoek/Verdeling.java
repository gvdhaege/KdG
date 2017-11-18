package be.kdg.sitebezoek;

/*
Deze klasse bevat een constante AANTAL met de waarde 1000. Verder zijn er de attributen uren en tijden die respectievelijk van het type int[] en Tijd[] zijn.
Voorzie een constructor die aan uren een int-tabel voor 24 getallen (de 24 uren in een dag) toekent en aan tijden een Tijd-tabel met een lengte gelijk aan AANTAL toekent.
Voorzie een getter voor de tabel uren, de returnwaarde is dus van het type int[].
Voorzie een methode genereerBezoekersTijden die aan elk element van tijden een nieuw Tijd-object toekent en daarna voor datzelfde element de methode maakRandomTijd van de klasse Tijd oproept.
Voorzie een methode voegBezoekersTijdenToe waarmee het moment dat een bezoeker op de site komt geregistreerd wordt aan de hand van het uur.
Voor alle elementen van de tabel tijden moet je de waarde van uren opvragen en die als index gebruiken om de aantallen in de int-tabel uren overeenkomstig te verhogen.
Voorzie een methode toonVerdeling die de gegenereerde bezoekersaantallen voor elk uur in de vorm van een String terruggeeft. Zie afdruk bij TestSiteBezoek.
Voorzie een methode getControleTotaal die een int-waarde terug met de som van alle aantalen in de tabel uren.
Voorzie een methode vroegste die de tijd van de vroegste bezoeker in de vorm van een String teruggeeft.
Voorzie een methode laatste die de tijd van de laatste bezoeker in de vorm van een String teruggeeft.
 */
public class Verdeling {
    public static final int AANTAL = 1000;

    private int[] uren;
    private Tijd[] tijden;


    public Verdeling() {
        uren = new int[24];
        tijden = new Tijd[AANTAL];
    }

    public int[] getUren() {
        return uren;
    }

    public void genereerBezoekersTijden() {
        for (int i = 0; i < AANTAL; i++) {
            tijden[i] = new Tijd();
            tijden[i].maakRandomTijd();
        }
    }

    public void voegBezoekersTijdenToe() {
        for (int i = 0; i < AANTAL; i++) {
            int index = tijden[i].getUren();
            uren[index]++;
        }
    }

    public String toonVerdeling() {
        String string = "";

        for (int i = 0; i < 12; i++) {
            string += String.format("uur %2d: %2d   uur %2d: %2d\n" , i, uren[i], (i + 12), uren[i + 12]);
        }
        return string;
    }

    public int getControleTotaal() {
        int totaal = 0;
        for (int i = 0; i < 24; i++) {
            totaal += uren[i];
        }
        return totaal;
    }

    public String vroegste() {
        Tijd vroegste = tijden[0];
        for (int i = 1; i < AANTAL; i++) {
            int tijd = tijden[i].toInteger();
            if (tijd < vroegste.toInteger()) {
                vroegste = tijden[i];
            }
        }
        return vroegste.toString();
    }

    public String laatste() {
       Tijd laatste = tijden[0];
       for (int i = 1; i < AANTAL; i++) {
            int tijd = tijden[i].toInteger();
            if (tijd > laatste.toInteger()) {
                laatste = tijden[i];
            }
       }
       return laatste.toString();
    }

}

