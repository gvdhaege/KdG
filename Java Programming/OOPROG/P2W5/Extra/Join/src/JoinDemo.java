import java.util.ArrayList;
import java.util.List;

public class JoinDemo {
    public static void main(String[] args) {
        List<TelefoonNummer> nummerLijst = new ArrayList<>();
        nummerLijst.add(new TelefoonNummer("011", "102487"));
        nummerLijst.add(new TelefoonNummer("03", "6891745"));
        nummerLijst.add(new TelefoonNummer("0497", "421505"));

        for (TelefoonNummer telefoonNummer : nummerLijst) {
            System.out.println(telefoonNummer);
        }

        String[] nummers = new String[nummerLijst.size()];
        for (int i = 0; i < nummers.length; i++) {
            nummers[i] = nummerLijst.get(i).toString();
        }

        String joined = String.join(" ~ ", nummers);
        System.out.println(joined);


    }
}