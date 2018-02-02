package be.kdg.stringbuilder;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder tekst1 = new StringBuilder("Dit is mijn eerste regel tekst");
        StringBuilder tekst2 = new StringBuilder("Dit is mijn tweede regel tekst");
        System.out.println(tekst1);
        System.out.println(tekst2);
        tekst1.append(" en dit heb ik toegevoegd ");
        System.out.println(tekst1);
        System.out.println(tekst2.reverse());
        for (int i = 0; i < tekst1.length(); i++) {
            if (tekst1.charAt(i) == ' ') {
                tekst1.deleteCharAt(i--);
            }
        }
        System.out.println(tekst1);
        for (int i = 0; i < tekst2.length(); i++) {
            if (tekst2.charAt(i) == 't') {
                tekst2.insert(i++, 't');
            }
        }
        System.out.println(tekst2);
    }
}

/*
Dit is mijn eerste regel tekst
Dit is mijn tweede regel tekst
Dit is mijn eerste regel tekst en dit heb ik toegevoegd
tsket leger edeewt njim si tiD
Ditismijneersteregeltekstendithebiktoegevoegd
ttskett leger edeewtt njim si ttiD
*/
