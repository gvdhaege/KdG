import werknemer.Arbeider;
import werknemer.Bediende;
import werknemer.Werknemer;

public class DemoAbstract {
    public static void main(String[] args) {
        //Dit gaat niet, want de klasse werknemer.Werknemer is abstract:
        //werknemer.Werknemer wn = new werknemer.Werknemer("Fred");

        //Dit kan wel (polymorfisme):
        Werknemer[] werknemers = {
                new Arbeider("Jos", 57082332149L, 38),
                new Arbeider("Els", 61030350468L, 40),
                new Bediende("Erik", 54110774131L, 1.6)
        };
        for(Werknemer werknemer : werknemers) {
            System.out.println(werknemer.berekenLoon());
        }
    }
}
/* AFDRUK:
475.0
512.5
3840.0
*/
