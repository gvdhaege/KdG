package be.kdg.factuur;

import java.util.ArrayList;
import java.util.List;

public class Facturatie {
    private List<Bestelling> bestellingen = new ArrayList<>();
    private Klanten klanten;
    private Artikels artikels;

    public Facturatie(Klanten klanten, Artikels artikels) {
        this.klanten = klanten;
        this.artikels = artikels;
    }

    public List<Bestelling> getBestellingen() {
        return bestellingen;
    }

    public void voegBestellingToe(Bestelling bestelling) {
        bestellingen.add(bestelling);
    }

    public String verwerkBestellingen() {
       String facturen = "";

        for (Bestelling bestelling : bestellingen) {
            Klant klant = klanten.zoekOpKlantNummer(bestelling.getKlantNummer());
            Artikel artikel = artikels.zoekOpArtikelNummer(bestelling.getArtikelNummer());
            int aantal = bestelling.getAantal();
            double teBetalen = artikel.getPrijs() * aantal;
            if (klant.isVasteKlant()) {
                teBetalen *= 0.9;
            }

            facturen += "\nnr: " + klant.getKlantNummer() + '\n' + klant + "\n";
            facturen += "-------------------------------------\n";
            facturen += artikel + "  (" + aantal + ")\n";
            facturen += String.format("Te betalen: €%5.2f\n", teBetalen);

        }
        return facturen;
    }
}
