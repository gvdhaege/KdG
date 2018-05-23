package be.kdg.wielrennen.patterns;

import be.kdg.wielrennen.model.WielRenner;
import be.kdg.wielrennen.model.WielRenners;
import be.kdg.wielrennen.model.WielRennersInterface;

import java.util.List;
import java.util.Observable;

public class ObservableWielRenners extends Observable implements WielRennersInterface {
    private WielRenners wielRenners;

    public ObservableWielRenners(WielRenners wielRenners) {
        this.wielRenners = wielRenners;
    }

    @Override
    public boolean voegToe(WielRenner wielRenner) {
        if (wielRenners.voegToe(wielRenner)) {
            setChanged();
            notifyObservers("Toegevoegd: " + wielRenner.toString());
        }
        return wielRenners.voegToe(wielRenner);
    }

    @Override
    public boolean verwijder(String naam, String voornaam) {
        WielRenner resultaat = wielRenners.zoek(naam, voornaam);

        if (resultaat != null) {
            setChanged();
            notifyObservers("Verwijderd: " + resultaat.toString());
        }
        return wielRenners.verwijder(naam, voornaam);
    }

    @Override
    public WielRenner zoek(String naam, String voornaam) {
        return wielRenners.zoek(naam, voornaam);
    }

    @Override
    public List<WielRenner> sorteerOpNationaliteit() {
        return wielRenners.sorteerOpNationaliteit();
    }

    @Override
    public List<WielRenner> sorteerOpGewicht() {
        return wielRenners.sorteerOpGewicht();
    }

    @Override
    public List<WielRenner> sorteerOpLengte() {
        return wielRenners.sorteerOpLengte();
    }

    @Override
    public int getAantal() {
        return wielRenners.getAantal();
    }
}
