import java.util.Arrays;

public class Verzameling {
    private final int MAX_AANTAL = 9;
    private Film[] films;
    private int index;
    private boolean isVol;

    public Verzameling() {
        films = new Film[MAX_AANTAL];
    }

    public Film[] getFilms() {
        return Arrays.copyOf(films, films.length);
    }

    public int getIndex() {
        return index;
    }

    public boolean isVol() {
        return isVol;
    }

    public void voegFilmToe(Film film) {
        if (index >= MAX_AANTAL) {
            isVol = true;
        } else {
            films[index++] = film;
        }
    }
}
