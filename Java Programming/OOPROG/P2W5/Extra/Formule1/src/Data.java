import java.util.Arrays;
import java.util.List;

public class Data {
    private Piloot[] piloten = {
            new Piloot("Mark Webber", "Red Bull"),
            new Piloot("Sebastian Vettel", "Red Bull"),
            new Piloot("Fernando Alonso", "Ferrari"),
            new Piloot("Felippe Massa", "Ferrari"),
            new Piloot("Kimi Räikkönen", "Lotus"),
            new Piloot("Romain Grosjean", "Lotus"),
            new Piloot("Lewis Hamilton", "Mercedes"),
            new Piloot("Nico Rosberg", "Mercedes"),
            new Piloot("Nico Hulkenberg", "Sauber-Ferrari"),
            new Piloot("Jenson Button", "McLaren-Mercedes")
    };

    public Data() {
        for (int i = 0; i < piloten.length; i++) {
            Tijd[] tijden = {
                    new Tijd(1, 12, 810),
                    new Tijd(1, 12, 328),
                    new Tijd(1, 12, 745),
                    new Tijd(1, 13, 516),
                    new Tijd(1, 13, 370),
                    new Tijd(1, 13, 458),
                    new Tijd(1, 13, 267),
                    new Tijd(1, 13, 424),
                    new Tijd(1, 13, 911),
                    new Tijd(1, 13, 871)
            };
            piloten[i].setTijd(tijden[i]);
        }
    }

    public List<Piloot> getPiloten() {
        return Arrays.asList(piloten);
    }
}