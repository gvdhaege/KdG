package be.kdg.wijnen;

/**
 * Mark Goovaerts
 * Datum: 17-11-13
 * Johan Ven
 * Datum: 10-11-14
 */
public enum Smaak {
    //Opdracht 3.1
    BRUT,
    EXTRA_BRUT,
    BRUT_SANS_MILLESIME,
    SEC,
    DEMI_SEC,
    DOUX;

    //Opdracht 3.2
    @Override
    public String toString() {
        switch(this.ordinal()) {
            case 0: return "Brut";
            case 1: return "Extra-brut";
            case 2: return "Brut sans Millésime";
            case 3: return "Sec";
            case 4: return "Demi-sec";
            default: return "Doux";
        }
    }
}
