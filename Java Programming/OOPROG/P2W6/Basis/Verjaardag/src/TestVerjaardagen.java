import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestVerjaardagen {
    public static void main(String[] args) {
        List<Persoon> persoonLijst = new ArrayList<>();
        Persoon[] personen = {
                new Persoon(LocalDate.of(0, 3, 15), "Jos"),
                new Persoon(LocalDate.of(0, 11, 8), "Annelien"),
                new Persoon(LocalDate.of(0, 8, 23), "Sven"),
                new Persoon(LocalDate.of(0, 9, 18), "Jessica"),
                new Persoon(LocalDate.of(0, 12, 25), "Jessica"),
                new Persoon(LocalDate.of(0, 8, 23), "Zohra")};

        HashMap<LocalDate, String> persoonMap = new HashMap<>();

        for (Persoon persoon : personen){
            persoonMap.put(persoon.getVerjaardag(), persoon.getNaam());
        }

        for (LocalDate localDate : persoonMap.keySet()){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM");
            System.out.println(localDate.format(formatter));
        }

        System.out.println();

        for (String string : persoonMap.values()){
            System.out.println(string);
        }

        System.out.println();

        for (Map.Entry<LocalDate, String> entry : persoonMap.entrySet()){
            System.out.println(new Persoon(entry.getKey(), entry.getValue()).toString());
        }
    }
}
