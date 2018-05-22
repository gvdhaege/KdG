package be.kdg.wielrennen.model;

import java.util.*;

public class WielRenners {
    private TreeSet<WielRenner> wielRenners;

    public WielRenners() {
        this.wielRenners = new TreeSet<>();
    }

    public boolean voegToe(WielRenner wielRenner) {
        return wielRenners.add(wielRenner);
    }

    public boolean verwijder(String naam, String voornaam) {
        for (WielRenner wielRenner : wielRenners) {
            if (naam.equalsIgnoreCase(wielRenner.getNaam()) && voornaam.equals(wielRenner.getVoornaam())) {
                return wielRenners.remove(wielRenner);
            }
        }
        return false;
    }

    public WielRenner zoek(String naam, String voornaam) {
        for (WielRenner wielRenner : wielRenners) {
            if (naam.equalsIgnoreCase(wielRenner.getNaam()) && voornaam.equals(wielRenner.getVoornaam())) {
                return wielRenner;
            }
        }
        return null;
    }

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
}
