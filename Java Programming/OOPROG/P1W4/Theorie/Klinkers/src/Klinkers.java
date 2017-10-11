public class Klinkers {
    private String woord;
    private int a = 0; // Teller voor het aantal keer de klinker a
    private int e = 0;
    private int i = 0;
    private int o = 0;
    private int u = 0;

    public Klinkers(String woord) { // Constructor
        this.woord = woord;
    }

    public String getWoord() {
        return woord;
    }

    public int getA() { // Getter voor het aantal keer a
        return a;
    }

    public int getE() {
        return e;
    }

    public int getI() {
        return i;
    }

    public int getO() {
        return o;
    }

    public int getU() {
        return u;
    }

    public void telKlinkers() {
        for (char letter : woord.toLowerCase().toCharArray()) {
            switch (letter) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }
    }


    public void reset() {
        a = 0;
        e = 0;
        i = 0;
        o = 0;
        u = 0;
    }
}