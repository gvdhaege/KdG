package be.kdg.wielrennen.patterns;

import be.kdg.wielrennen.model.WielRenner;
import be.kdg.wielrennen.model.WielRenners;
import be.kdg.wielrennen.model.WielRennersInterface;

import java.util.Collections;
import java.util.List;

public class UnmodifiableWielRenners implements WielRennersInterface {
    private WielRenners wielRenners;

    public UnmodifiableWielRenners(WielRenners wielRenners) {
        this.wielRenners = wielRenners;
    }

    @Override
    public boolean voegToe(WielRenner wielRenner) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean verwijder(String naam, String voornaam) {
        throw new UnsupportedOperationException();
    }

    @Override
    public WielRenner zoek(String naam, String voornaam) {
        return wielRenners.zoek(naam, voornaam);
    }

    @Override
    public List<WielRenner> sorteerOpNationaliteit() {
        return Collections.unmodifiableList(wielRenners.sorteerOpNationaliteit());
    }

    @Override
    public List<WielRenner> sorteerOpGewicht() {
        return Collections.unmodifiableList(wielRenners.sorteerOpGewicht());
    }

    @Override
    public List<WielRenner> sorteerOpLengte() {
        return Collections.unmodifiableList(wielRenners.sorteerOpLengte());
    }

    @Override
    public int getAantal() {
        return wielRenners.getAantal();
    }
}
