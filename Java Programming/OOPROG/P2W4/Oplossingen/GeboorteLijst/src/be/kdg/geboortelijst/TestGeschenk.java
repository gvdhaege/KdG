package be.kdg.geboortelijst;

/**
 * Mark Goovaerts
 * Datum: 2-12-13
 */
public class TestGeschenk {
    public static void main(String[] args) {
        try {
            //Geschenk g1 = new Geschenk("", 5);
            //Geschenk g2 = new Geschenk("ikke", -2);
            Geschenk g3 = new Geschenk("gij", 10);
            g3.setKoper("Louis");
            System.out.println(g3);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
