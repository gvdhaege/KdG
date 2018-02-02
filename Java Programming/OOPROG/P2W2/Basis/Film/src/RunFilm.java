public class RunFilm {
    public static void main(String[] args) {
        Verzameling verzameling = new Verzameling();
        Film[] films = verzameling.getVerzameling();
        for(int i = 0; i< verzameling.getAantalFilms(); i++) {
            System.out.println(films[i]);
        }
    }
}