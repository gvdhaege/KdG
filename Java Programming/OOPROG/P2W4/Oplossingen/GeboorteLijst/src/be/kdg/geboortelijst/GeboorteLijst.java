package be.kdg.geboortelijst;

import be.kdg.geboortelijst.Geschenk;
import be.kdg.geboortelijst.exception.GeboorteLijstException;
import be.kdg.geboortelijst.exception.GeschenkException;

/**
 * Mark Goovaerts
 * Datum: 2-12-13
 */
public class GeboorteLijst {
    private String naam;
    private Geschenk[] geschenken;
    private int aantal;

    public GeboorteLijst(String naam) {
        this.naam = naam;
        geschenken = new Geschenk[30];
    }

    public void voegGeschenkToe(Geschenk nieuw) {
        geschenken[aantal++] = nieuw;
    }

    public double koop(String geschenkNaam, String koper) throws GeboorteLijstException, GeschenkException {
        for(int i = 0; i < aantal; i++) {
            if(geschenken[i].getNaam().equals(geschenkNaam)) {
                geschenken[i].setKoper(koper);
                return geschenken[i].getPrijs();
            }
        }
        throw new GeboorteLijstException("Geschenk niet gevonden in de lijst");
    }

    public void toon() {
        System.out.println("Geboortelijst voor " + naam);
        System.out.println("==================================");
        for(int i = 0; i < aantal; i++) {
            System.out.println(geschenken[i]);
        }
        System.out.println("==================================");
    }
}
