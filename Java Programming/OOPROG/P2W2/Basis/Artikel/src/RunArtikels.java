import java.time.LocalDate;
import java.time.Month;

public class RunArtikels {
    private static final Artikel[] gegevens = {
            new Artikel("Kitkat", 13,
                    LocalDate.of(2014, Month.NOVEMBER, 12)),
            new Artikel("Lollipop", 147, LocalDate.of(2014, 12, 12)),
            new Artikel("Jelly Bean", 23, LocalDate.of(2014, 11, 12)),
            new Artikel("Froyo", 56, LocalDate.of(2013, 11, 12)),
            new Artikel("Donut", 123, LocalDate.of(2014, 11, 13)),
            new Artikel("Cupcake", 77, LocalDate.of(2014, 11, 11))
    };
    public static void main(String[] args) {
        Artikels artikels = new Artikels(gegevens);
        System.out.println("Alle artikels:");
        for (Artikel artikel : artikels.getArtikels()){
            System.out.println(artikel);
        }
        System.out.println();
        System.out.println("Artikels met productiedatum 12 november 2014");
        for (Artikel artikel : artikels.getArtikels()){
            if (artikel.getProductieDatum().isEqual(LocalDate.of(2014, 11, 12))){
                System.out.println(artikel);
            }
        }
    }
}