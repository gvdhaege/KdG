package be.kdg.examen.klassement.archiefhouders;

import be.kdg.examen.klassement.archiefstukken.Archiefstuk;
import be.kdg.examen.klassement.archiefstukken.Boek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Doos implements ArchiefHouder {
    private final double LENGTE = 0.305;
    private final double BREEDTE = 0.215;
    private final double HOOGTE = 0.110;

    private List<Archiefstuk> stockage;

    public Doos() {
        this.stockage = new ArrayList<>();
    }

    public List<Boek> getBoeken() {
        List<Boek> boeken = new ArrayList<>();
        for (Archiefstuk archiefstuk : stockage) {
            if (archiefstuk instanceof Boek) {
                boeken.add((Boek) archiefstuk);
            }
        }
        return Collections.unmodifiableList(boeken);
    }

    @Override
    public double getMaxVolume() {
        return LENGTE * BREEDTE * HOOGTE;
    }

    @Override
    public double vullingsGraad() {
        double volumeDoos = 0.0;
        for (Archiefstuk archiefstuk : stockage) {
            volumeDoos += archiefstuk.getOmvang();
        }

        return volumeDoos / getMaxVolume();
    }

    @Override
    public boolean isVol() {
        return vullingsGraad() <= 0.95;
    }

    @Override
    public void stockeer(Archiefstuk archiefstuk) {
        stockage.add(archiefstuk);
    }

}
