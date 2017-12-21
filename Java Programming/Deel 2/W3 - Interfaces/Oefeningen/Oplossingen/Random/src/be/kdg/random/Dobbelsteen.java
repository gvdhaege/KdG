package be.kdg.random;

/*
De klasse Dobbelsteen erft over van de klasse RandomElement en doet een override van de methode gooi.
Hier moet je een willekeurige int in de range 1..6 teruggeven.
 */
public class Dobbelsteen extends RandomElement {

    @Override
    public int gooi() {
       return getGenerator().nextInt(6) + 1;
    }
}
