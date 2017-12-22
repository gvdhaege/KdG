import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VerwerkData {
    private List<Naam> lijst;

    public VerwerkData() {
        Data data = new Data();
        this.lijst = new ArrayList<>(data.getData());
    }

    public void sorteerVolgensNaam() {
        Collections.sort(lijst);
    }

    public void sorteerVolgensVoornaam() {
        Collections.sort(lijst, new VoornaamComparator());
    }

    public void toon(){
        for (Naam naam : lijst) {
            System.out.println(naam);
        }
    }

    private class VoornaamComparator implements Comparator<Naam> {
        public int compare(Naam naam, Naam andereNaam) {
            return naam.getVoornaam().compareTo(andereNaam.getVoornaam());
        }
    }
}
