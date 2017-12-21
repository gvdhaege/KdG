package be.kdg.planeten;

import java.util.Arrays;
import java.util.Comparator;

/*
De klasse Planeten bevat naast een klassieke tabel 4 verschillende sorteermethoden en een toString-methode.
Voorzie een methode sorteer waarin gebruik gemaakt wordt van de compareTo-methode van de klasse Planeet.
Dit is sorteren volgens oplopende diameter.
Voorzie een methode sorteerDiamater waarin je via een nieuwe Comparator sorteert volgens dalende diameter.
Voorzie een methode sorteerNaam waarin je via een nieuwe Comparator alfabetisch op naam sorteert.
Voorzie een methode sorteerMassawaarin je via een nieuwe Comparator volgens dalende relatieve massa sorteert.
 */
public class Planeten {
    private static Planeet[] planeten = {
            new Planeet("Mercurius", 4800, 0.1),
            new Planeet("Venus", 12104, 0.9),
            new Planeet("Aarde", 12756, 1),
            new Planeet("Mars", 6794, 0.1),
            new Planeet("Jupiter", 142984, 318),
            new Planeet("Saturnus", 120536, 95),
            new Planeet("Uranus", 51118, 15),
            new Planeet("Neptunus", 49572, 17)
    };

    public void sorteer() {  // via compareTo methode in Planeet
        Arrays.sort(planeten);
    }

    public void sorteerDiameter() {
        Arrays.sort(planeten, new Comparator<Planeet>() {
            public int compare(Planeet planeet, Planeet anderePlaneet) {
                return anderePlaneet.getDiameter() - planeet.getDiameter();
            }
        });
        // Collections.sort(new ArrayList<Planeet>(), Collections.reverseOrder());
    }

    public void sorteerNaam() {
        Arrays.sort(planeten, new Comparator<Planeet>() {
            public int compare(Planeet planeet, Planeet anderePlaneet) {
                String naam = planeet.getNaam();
                String andereNaam = anderePlaneet.getNaam();
                return naam.compareTo(andereNaam);
            }
        });
        // Arrays.sort(planeten, new MyComparator());
    }

    /*
    private class MyComparator implements Comparator<Planeet> {
        public int compare(Planeet planeet, Planeet anderePlaneet) {
            String naam = planeet.getNaam();
            String andereNaam = anderePlaneet.getNaam();
            return naam.compareTo(andereNaam);
        }
    }
    */

    public void sorteerMassa() {
        Arrays.sort(planeten, new Comparator<Planeet>() {
            public int compare(Planeet planeet, Planeet anderePlaneet) {
                double massa = planeet.getRelatieveMassa();
                double andereMassa = anderePlaneet.getRelatieveMassa();
                if (massa < andereMassa) return 1;
                return -1;
            }
        });
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Planeet planeet : planeten) {
            builder.append(planeet).append('\n');
        }
        return builder.toString();
    }

}


