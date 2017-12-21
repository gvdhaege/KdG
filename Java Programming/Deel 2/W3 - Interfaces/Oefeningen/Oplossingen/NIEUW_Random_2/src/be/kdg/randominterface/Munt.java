package be.kdg.randominterface;

/*
De klasse Dobbelsteen implemmenteert de Gooibaar interface en doet een override van de default methode gooi.
Nu moet je een willekeurige int in de range 0..1 teruggeven.

*/
public class Munt implements Gooibaar {

    @Override
    public int gooi() {
       return Gooibaar.getGenerator().nextInt(2);
    }
}
