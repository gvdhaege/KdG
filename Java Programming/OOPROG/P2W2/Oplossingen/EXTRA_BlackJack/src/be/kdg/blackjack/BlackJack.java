package be.kdg.blackjack;

/*
Vul de klasse aan gebruik makende van de gegeven declaraties.
 */
public class BlackJack {
    public enum Status {
        START, GEWONNEN, VERLOREN, GESTOPT, NOG_EEN_KAART
    }

    private final Kaarten kaarten = new Kaarten();
    private Status status = Status.START;
    private int totaal;
//
    public void speel(char keuze) {
        if (keuze == 'H') {
            status = Status.GESTOPT;
            toonBericht();
            reset();
        } else if (keuze == 'D') {
            verwerk();
        }
    }

    private void verwerk() {
        SpeelKaart kaart;

        if (status == Status.START) {
            kaart = kaarten.neemKaart();
            int waarde = kaart.getGetalWaarde();
            if (waarde == 1) {
                waarde = 11;
            }
            totaal += waarde;
            toonKaart(kaart);
        }
        kaart = kaarten.neemKaart();
        int waarde = kaart.getGetalWaarde();
        if (waarde == 1 && totaal + 11 <= 21) {
            waarde = 11;
        }
        totaal += waarde;
        toonKaart(kaart);
        status = Status.NOG_EEN_KAART;
        if (totaal == 21) {
            status = Status.GEWONNEN;
            toonBericht();
            reset();
        } else if (totaal > 21) {
            status = Status.VERLOREN;
            toonBericht();
            reset();
        }
    }

    public void reset() {
        status = Status.START;
        totaal = 0;
    }

    public void toonKaart(SpeelKaart kaart) {
        System.out.println(kaart.toonKaart());
    }

    public void toonBericht() {
        switch (status) {
            case GESTOPT:
                System.out.println("Totaal: " + totaal + " punten.\n");
                break;
            case GEWONNEN:
                System.out.println("PROFICIAT!\n");
                break;
            case VERLOREN:
                System.out.println("Jammer: je bent verloren met " + totaal + " punten.\n");
                break;
        }
    }
}
