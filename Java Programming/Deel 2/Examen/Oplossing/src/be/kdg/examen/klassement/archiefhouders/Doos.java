package be.kdg.examen.klassement.archiefhouders;

import be.kdg.examen.klassement.archiefstukken.Archiefstuk;
import be.kdg.examen.klassement.archiefstukken.Boek;

import java.util.ArrayList;
import java.util.List;

// gegeven, mag je wijzigen
public class Doos implements ArchiefHouder {

    // gegeven, mag je wijzigen
    private final double lengte = 0.305;
    private final double breedte = 0.215;
    private final double hoogte = 0.110;

    private List<Archiefstuk> inhoud;

    public Doos() {
        this.inhoud = new ArrayList<>();
    }

    public List<Boek> getBoeken()
    {
        List<Boek> boeken = new ArrayList<>();
        for(Archiefstuk archiefstuk : inhoud)
        {
            if(archiefstuk instanceof Boek)
                boeken.add((Boek) archiefstuk);
        }
        return boeken;
    }

    @Override
    public void stockeer(Archiefstuk archiefstuk) {
        inhoud.add(archiefstuk);
    }

    @Override
    public double vullingsGraad() {

        double inhoudsVolume = 0.0;

        for (Archiefstuk archiefstuk : inhoud) {
            inhoudsVolume += archiefstuk.getOmvang();
        }
        return inhoudsVolume / getVolume();
    }

    @Override
    public double getVolume() {
        return lengte * breedte * hoogte;
    }

    @Override
    public boolean isVol()
    {
        return vullingsGraad() >= 0.95;
    }
}
