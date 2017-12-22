import java.util.*;

public class TestActeur {
    private static final Acteur[] testdata = {
            new Acteur("Cameron Diaz", 1972),
            new Acteur("Anna Faris", 1976),
            new Acteur("Angelina Jolie", 1975),
            new Acteur("Jennifer Lopez", 1970),
            new Acteur("Reese Witherspoon", 1976),
            new Acteur("Neve Campbell", 1973),
            new Acteur("Catherine Zeta-Jones", 1969),
            new Acteur("Kirsten Dunst", 1982),
            new Acteur("Kate Winslet", 1975),
            new Acteur("Gina Philips", 1975),
            new Acteur("Shannon Elisabeth", 1973),
            new Acteur("Carmen Electra", 1972),
            new Acteur("Drew Barrymore", 1975),
            new Acteur("Elisabeth Hurley", 1965),
            new Acteur("Tara Reid", 1975),
            new Acteur("Katie Holmes", 1978),
            new Acteur("Anna Faris", 1976)
    };

    public static void main(String[] args) {
        Acteur reese = new Acteur("Reese Witherspoon", 1976);
        Acteur drew = new Acteur("Drew Barrymore", 1975);
        Acteur anna = new Acteur("Anna Faris", 1976);
        Acteur thandie = new Acteur("Thandie Newton", 1972);
        List<Acteur> acteurs = new ArrayList<Acteur>();
        acteurs.addAll(Arrays.asList(testdata));
        acteurs.add(reese);
        acteurs.add(drew);
        acteurs.add(anna);
        acteurs.add(thandie);

        for (Acteur acteur : acteurs) {
            System.out.println(acteur);
        }

        acteurs.remove(reese);
        acteurs.remove(thandie);

        Iterator<Acteur> iterator = acteurs.iterator();
        while(iterator.hasNext()){
            if (iterator.next().getGeboorteJaar() == 1975){
                iterator.remove();
            }
        }

        Set<Acteur> acteurSet = new HashSet<>(acteurs);
        acteurs.clear();
        acteurs.addAll(acteurSet);

        Collections.sort(acteurs);

        System.out.println("\n Uiteindelijke inhoud:\n");
        for (Acteur acteur : acteurs) {
            System.out.println(acteur);
        }

    }
}
