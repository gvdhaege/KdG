public class Auto {
    private String merk;
    private String type;
    int fiscaalVermogen;

    public Auto(String merk, String type, int
            fiscaalVermogen) {
        this.merk = merk;
        this.type = type;
        this.fiscaalVermogen = fiscaalVermogen;
    }

    public String getMerk() {
        return merk;
    }

    public String getType() {
        return type;
    }

    public int getFiscaalVermogen() {
        return fiscaalVermogen;
    }

    double berekenVerkeersbelasting() {
        double belasting = 0.0;
        if (fiscaalVermogen <= 20) {
            switch (fiscaalVermogen) {
                case 3:
                case 4:
                    belasting = 75.77;
                    break;
                case 5:
                    belasting = 94.91;
                    break;
                case 6:
                    belasting = 137.02;
                    break;
                case 7:
                    belasting = 179.12;
                    break;
                case 8:
                    belasting = 221.50;
                    break;
                case 9:
                    belasting = 263.87;
                    break;
                case 10:
                    belasting = 305.71;
                    break;
                case 11:
                    belasting = 396.66;
                    break;
                case 12:
                    belasting = 487.74;
                    break;
                case 13:
                    belasting = 578.56;
                    break;
                case 14:
                    belasting = 669.50;
                    break;
                case 15:
                    belasting = 760.58;
                    break;
                case 16:
                    belasting = 996.07;
                    break;
                case 17:
                    belasting = 1231.96;
                    break;
                case 18:
                    belasting = 1467.71;
                    break;
                case 19:
                    belasting = 1702.93;
                    break;
                case 20:
                    belasting = 1938.68;
                    break;
            }
        } else {
            belasting = 1938.68 + (fiscaalVermogen - 20) * 105.73;
        }
        return belasting;
    }
}