package be.kdg.random;

/*
De klasse Dobbelsteen erft over van de klasse RandomElement en doet een override van de methode gooi.
Nu moet je een willekeurige int in de range 0..1 teruggeven.

*/
public class Munt extends RandomElement {

    @Override
    public int gooi() {
       return getGenerator().nextInt(2);
    }
}
