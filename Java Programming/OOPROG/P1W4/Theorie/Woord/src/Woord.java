public class Woord {
    private String woord;

    public Woord(String woord) {
        this.woord = woord;
    }

    public String getWoord() {
        return woord;
    }

    public int aantalLetters() {
        return woord.length();
    }

    public boolean isLeeg() {
        return woord.isEmpty();
    }

    public String eersteLetterNaarHoofdletter() {
        char ch = Character.toUpperCase(woord.charAt(0));
        return ch + woord.substring(1);
    }

    public String naarHoofdletters() {
        return woord.toUpperCase();
    }
}
