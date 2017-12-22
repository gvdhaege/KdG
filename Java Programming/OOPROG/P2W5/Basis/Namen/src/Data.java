import java.util.Arrays;
import java.util.List;

public class Data {
    static Naam[] namen = {
            new Naam("Tobback", "Louis"),
            new Naam("Martens", "Wilfried"),
            new Naam("Smet", "Miet"),
            new Naam("De Decker", "Jean-Pierre")
    };

    List<Naam> getData() {
        return Arrays.asList(namen);
    }
}