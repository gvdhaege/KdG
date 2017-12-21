package be.kdg.randominterface;

/*
De klasse Dobbelsteen erft over van de klasse RandomElement en doet een override van de methode gooi.
Hier moet je een willekeurige int in de range 1..6 teruggeven.
 */
public class Dobbelsteen implements Gooibaar {

    @Override
    public int gooi() {
       return Gooibaar.getGenerator().nextInt(6) + 1;
    }
}
