package be.kdg.wielrennen.model;

import java.util.List;

public interface WielRennersInterface {
    boolean voegToe(WielRenner wielRenner);

    boolean verwijder(String naam, String voornaam);

    WielRenner zoek(String naam, String voornaam);

    List<WielRenner> sorteerOpNationaliteit();

    List<WielRenner> sorteerOpGewicht();

    List<WielRenner> sorteerOpLengte();

    int getAantal();
}
