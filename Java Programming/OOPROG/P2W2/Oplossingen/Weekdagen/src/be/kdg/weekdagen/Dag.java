package be.kdg.weekdagen;

/**
 * @author Kristiaan Behiels
 * @version 1.0 29/10/13
 *
 * Zie cursus Noël Vaes p147
 */
public enum Dag {
    /*
    MAANDAG(true), DINSDAG(true), WOENSDAG(true), DONDERDAG(true),
    VRIJDAG(true), ZATERDAG(false), ZONDAG(false);

    private boolean isWeekdag;

    private Dag(boolean weekdag) {
        this.isWeekdag = weekdag;
    }

    public String toString() {
        return name().toLowerCase() + (isWeekdag ? "(weekdag)" : "(weekend)");
    }*/

    /*
    MAANDAG("maandag"), DINSDAG("dinsdag"), WOENSDAG("woensdag"),
    DONDERDAG("donderdag"), VRIJDAG("vrijdag"), ZATERDAG("zaterdag"),
    ZONDAG("zondag");

    private String naam;
    private Dag(String naam) {
        this.naam = naam;
    }
    public String toString() {
        String soortDag = "weekdag";
        if (naam.equals("zaterdag") || naam.equals("zondag")) {
           soortDag = "weekend";
        }
        return naam + "(" + soortDag + ")";
    }
    */

    MAANDAG, DINSDAG, WOENSDAG, DONDERDAG, VRIJDAG, ZATERDAG, ZONDAG;
     public String toString() {
        String soortDag = "weekdag";
        if (name().equals("zaterdag") || name().equals("zondag")) {
            soortDag = "weekend";
        }
        return name().toLowerCase() + "(" + soortDag + ")";
    }
}
