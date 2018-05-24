package be.kdg.wielrennen.model;

import be.kdg.wielrennen.persist.WielRennerDao;

import java.io.Serializable;
import java.util.*;

public class WielRenners implements Serializable, WielRennerDao {
    private TreeSet<WielRenner> wielRenners;

    public WielRenners() {
        this.wielRenners = new TreeSet<>();
    }

    @Override
    public boolean voegToe(WielRenner wielRenner) {
        return wielRenners.add(wielRenner);
    }

    @Override
    public boolean verwijder(String naam, String voornaam) {
        for (WielRenner wielRenner : wielRenners) {
            if (naam.equalsIgnoreCase(wielRenner.getNaam()) && voornaam.equals(wielRenner.getVoornaam())) {
                return wielRenners.remove(wielRenner);
            }
        }
        return false;
    }

    @Override
    public WielRenner zoek(String naam, String voornaam) {
        for (WielRenner wielRenner : wielRenners) {
            if (naam.equalsIgnoreCase(wielRenner.getNaam()) && voornaam.equals(wielRenner.getVoornaam())) {
                return wielRenner;
            }
        }
        return null;
    }

    public List<WielRenner> getWielRenners() {
        return new ArrayList<>(wielRenners);
    }

    @Override
    public List<WielRenner> sorteerOpNationaliteit() {
        List<WielRenner> rennersNationaliteit = new ArrayList<>(wielRenners);
        rennersNationaliteit.sort(new Comparator<WielRenner>() {
            @Override
            public int compare(WielRenner o1, WielRenner o2) {
                return o1.getNationaliteit().compareTo(o2.getNationaliteit());
            }
        });
        return Collections.unmodifiableList(rennersNationaliteit);
    }

    @Override
    public List<WielRenner> sorteerOpGewicht() {
        List<WielRenner> rennersGewicht = new ArrayList<>(wielRenners);
        rennersGewicht.sort(new Comparator<WielRenner>() {
            @Override
            public int compare(WielRenner o1, WielRenner o2) {
                return Double.compare(o1.getGewicht(), (o2.getGewicht()));
            }
        });
        return Collections.unmodifiableList(rennersGewicht);
    }

    @Override
    public List<WielRenner> sorteerOpLengte() {
        List<WielRenner> rennersLengte = new ArrayList<>(wielRenners);
        rennersLengte.sort(new Comparator<WielRenner>() {
            @Override
            public int compare(WielRenner o1, WielRenner o2) {
                return Integer.compare(o1.getLengte(), o2.getLengte());
            }
        });
        return Collections.unmodifiableList(rennersLengte);
    }

    public int getAantal() {
        return wielRenners.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WielRenners that = (WielRenners) o;
        return Objects.equals(wielRenners, that.wielRenners);
    }

    @Override
    public int hashCode() {

        return Objects.hash(wielRenners);
    }
}
