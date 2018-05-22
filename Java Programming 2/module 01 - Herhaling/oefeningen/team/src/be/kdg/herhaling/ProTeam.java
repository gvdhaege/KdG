package be.kdg.herhaling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProTeam extends Team implements Showable {
    private String sponsorNaam;
    private SponsorSoort sponsorSoort;

    public ProTeam(String naam, String sponsorNaam, SponsorSoort sponsorSoort) {
        super(naam);
        this.sponsorNaam = sponsorNaam;
        this.sponsorSoort = sponsorSoort;
    }

    public String getSponsorNaam() {
        return sponsorNaam;
    }

    public SponsorSoort getSponsorSoort() {
        return sponsorSoort;
    }

    public void show() {
        System.out.println("Naam: " + this.getNaam());
        System.out.printf("Sponsor: %s (%s)\n", this.getSponsorNaam(), this.getSponsorSoort());
        System.out.println("Leden:");
        List<Speler> spelers = this.getSpelers();
        for (Speler speler : spelers) {
            System.out.println(speler);
        }
    }

    //TODO  6.4  Vul de methode verhaspelSponsorNaam aan.
    // De methode dient de volgorde van de letters van de sponsornaam willekeurig door elkaar te halen
    // en als String terug te geven.
    public String verhaspelSponsorNaam() {
        List<String> letters = Arrays.asList(getSponsorNaam().split(""));
        Collections.shuffle(letters);
        StringBuilder temp = new StringBuilder();
        for (String letter : letters) {
            temp.append(letter);
        }

        return temp.toString();
    }
}
