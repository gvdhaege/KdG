import Dieren.Dier;

public class Boerderij {
    private static final int MAX_DIEREN = 5;
    private Dier[] dieren = new Dier[MAX_DIEREN];
    private int aantalDieren;

    public void voegDierToe(Dier dier) {
        if (aantalDieren >= MAX_DIEREN) {
            System.out.println("Er is geen plaats meer voor " + dier.getNaam() + ". De stal zit vol!");
        } else {
            dieren[aantalDieren++] = dier;
        }
    }

    public void toonDieren() {
        for (int i = 0; i < aantalDieren; i++) {
            System.out.println(dieren[i]);
        }
    }

    public void toonGeluiden() {
        for (int i = 0; i < aantalDieren; i++) {
            System.out.println(dieren[i].getNaam() + " maakt geluid \"" + dieren[i].getGeluid() + "\"");
        }
    }

    public void toonVoeding() {
        for (int i = 0; i < aantalDieren; i++) {
            System.out.println(dieren[i].getNaam() + " eet " + dieren[i].getVoeding());
        }
    }

    public boolean zoekDierOpNaam(String naam) {
        for (int i = 0; i < aantalDieren; i++) {
            if (naam.equalsIgnoreCase(dieren[i].getNaam())) {
                return true;
            }
        }
        return false;
    }
}