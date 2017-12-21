package be.kdg.euro;

/**
 * @author Kristiaan Behiels
 * @version 1.0 31/10/13
 */
public class EuroConversie {
    /* static inner class */
    private static class EuroMunt {
        private double omrekeningsKoers;
        private String muntCode;
        private String omschrijving;

        private EuroMunt(double omrekeningsKoers, String muntCode, String omschrijving) {
            this.omrekeningsKoers = omrekeningsKoers;
            this.muntCode = muntCode;
            this.omschrijving = omschrijving;
        }
    }
    /* einde static inner class */

    private static final EuroMunt[] munten = {
            new EuroMunt(13.7603, "ATS", "Oostenrijkse schilling"),
            new EuroMunt(40.3399, "BEF", "Belgische frank"),
            new EuroMunt(1.95583, "DEM", "Duitse mark"),
            new EuroMunt(166.386, "ESP", "Spaanse peseta"),
            new EuroMunt(5.94573, "FIM", "Finse mark"),
            new EuroMunt(6.55957, "FRF", "Franse frank"),
            new EuroMunt(340.750, "GRD", "Griekse drachme"),
            new EuroMunt(0.787564, "IEP", "Iers pond"),
            new EuroMunt(1936.27, "ITL", "Italiaanse lire"),
            new EuroMunt(40.3399, "LUF", "Luxemburgse frank"),
            new EuroMunt(2.20371, "NLG", "Nederlandse gulden"),
            new EuroMunt(200.482, "PTE", "Portugese escudo"),
            new EuroMunt(239.640, "SIT", "Sloveense tolar"),
            new EuroMunt(0.585274, "CYP", "Cyprisch pond"),
            new EuroMunt(0.4293, "MTL", "Maltese lira"),
            new EuroMunt(30.126, "SKK", "Slowaakse kroon"),
            new EuroMunt(15.6466, "EEK", "Estse kroon"),
            new EuroMunt(0.709161, "LVL", "Letse lats")
    };

    private static int euroMuntIndex(String muntCode) {
        for (int i = 0; i < munten.length; i++) {
            String code = munten[i].muntCode;
            if (code.equalsIgnoreCase(muntCode)) {
                return i;
            }
        }
        return -1;
    }

    public static String getOmschrijving(String muntCode) {
        return munten[euroMuntIndex(muntCode)].omschrijving;
    }

    public static double naarEuro(String muntCode, double bedrag) {
        return bedrag / munten[euroMuntIndex(muntCode)].omrekeningsKoers;
    }

    public static double naarLokaleMunt(String muntCode, double bedrag) {
        return bedrag * munten[euroMuntIndex(muntCode)].omrekeningsKoers;
    }

    public static boolean isEuroMunt(String muntCode) {
        for (EuroMunt euroMunt : munten) {
            if (euroMunt.muntCode.equalsIgnoreCase(muntCode)) {
                return true;
            }
        }
        return false;
    }
}
