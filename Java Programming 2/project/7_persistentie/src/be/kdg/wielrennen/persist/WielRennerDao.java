package be.kdg.wielrennen.persist;

import be.kdg.wielrennen.model.WielRenner;

import java.util.List;

public interface WielRennerDao {
    boolean voegToe(WielRenner wielRenner);

    boolean verwijder(String naam, String voornaam);

    WielRenner zoek(String naam, String voornaam);

    List<WielRenner> sorteerOpNationaliteit();

    List<WielRenner> sorteerOpGewicht();

    List<WielRenner> sorteerOpLengte();
}
