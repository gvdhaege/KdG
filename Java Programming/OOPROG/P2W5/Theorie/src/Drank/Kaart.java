package Drank;

import java.util.*;

public class Kaart{
    List<Drank> dranken = new LinkedList<>();

    public void voegDrankToe(Drank drank) {
        dranken.add(drank);
    }

    public int getAantal() {
        return dranken.size();
    }

    public double getTotalePrijs() {
        double som = 0;
        for (Drank drank : dranken) {
            som += drank.getPrijs();
        }
        return som;
    }

    public double getDuurste() {
        double duurste = 0;
        if (dranken.size() > 0) {
            for (Drank drank : dranken) {
                if (drank.getPrijs() > duurste) {
                    duurste = drank.getPrijs();
                }
            }
        }
        return duurste;
    }

    public List<Drank> getAlcoholischeDranken() {
        List<Drank> alcoholischeDranken = new ArrayList<>();
        for (Drank drank : dranken) {
            if (drank.isAlcoholisch()) {
                alcoholischeDranken.add(drank);
            }
        }
        return alcoholischeDranken;
    }

    public void verwijderDuurderDan(double waarde){
        Iterator<Drank> iterator = dranken.iterator();
        while(iterator.hasNext()){
            if (iterator.next().getPrijs() > waarde){
                iterator.remove();
            }
        }
    }

    public void voegDrankenToe (Drank[] dranken){
        List<Drank> drankenList = new ArrayList<>();
        for (Drank drank : dranken){
            this.dranken.add(drank);
        }
    }
    public void sorteer(){
        Collections.sort(dranken);
    }

    @Override
    public String toString() {
        return "Kaart:" + dranken;
    }
}
