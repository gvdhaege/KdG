public class DAB_Radio {
    private boolean status;
    private int zenderNummer = 1;
    private final String[] zenderNamen = new String[]{
            "Radio 1", "Radio 2", "Klara", "Stu Bru", "MNM",
            "Continue", "Sporza", "Nieuws+", "MNM Hits"
    };

    public boolean getStatus() {
        return status;
    }

    public void setZender(int zenderNummer) {
        this.zenderNummer = zenderNummer;
    }

    public void aan() {
        status = true;
    }

    public void uit() {
        status = false;
    }

    public String getResponse() {
        if (!status) {
            return "Zet de radio eerst aan!";
        } else if (zenderNummer < 1 || zenderNummer > zenderNamen.length) {
            return "Geen geldig zendernummer!";
        } else {
            return String.format("U luistert naar %s (zender nr %d)", zenderNamen[zenderNummer - 1], zenderNummer);
        }
    }
}
