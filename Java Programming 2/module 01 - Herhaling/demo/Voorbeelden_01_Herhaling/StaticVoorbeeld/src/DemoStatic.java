
public class DemoStatic {
    public static void main(String[] args) {
        // static variabele is bereikbaar via de klasse:
        System.out.println("Aantal werknemers (begin): " + Werknemer.getAantal());

        Werknemer eersteWerkenemer = new Werknemer("Fred");
        Werknemer tweedeWerkenemer = new Werknemer("Annit");

        // instance variabele is bereikbaar via het object:
        System.out.printf("Werknemer wn1 heet: %s\n", eersteWerkenemer.getNaam());
        System.out.printf("Werknemer wn2 heet: %s\n", tweedeWerkenemer.getNaam());
        // static variabele is bereikbaar via de klasse:
        System.out.println("Aantal werknemers (einde): " + Werknemer.getAantal());
    }
}
