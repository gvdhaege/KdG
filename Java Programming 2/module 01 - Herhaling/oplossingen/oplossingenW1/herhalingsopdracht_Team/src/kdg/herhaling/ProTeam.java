package kdg.herhaling;

import java.util.List;
import java.util.Random;

public class ProTeam extends Team {
    private String sponsorNaam;
    private SponsorSoort sponsorSoort;

    // 6.1 Laat deze klasse van de klasse Team overerven

    // 6.2 Schrijf de nodige constructor + getters voor beide attributen
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

    // 6.3 Schrijf een getter voor de naam van het team

    // 6.4 Implementeer hier de methode van de interface (showTeam),
    // ze toont alle informatie in verband met het team (zie verder voor een voorbeeld)
    public void showTeam() {
        System.out.println("Naam: " + getNaam());
        System.out.printf("Sponsor: %s (%s)\n", sponsorNaam, sponsorSoort);
        System.out.println("Leden:");
        List<Speler> spelers = super.getSpelers();
        for (Speler speler : spelers) {
            System.out.println(speler);
        }
    }

    // 6.5  Vul de methode verhaspelSponsorNaam aan.
    // De methode dient de volgorde van de letters van de sponsornaam willekeurig door elkaar te halen
    // en als String terug te geven.
    public String verhaspelSponsorNaam() {
        String shuffledString = "";
        Random random = new Random();
        while (sponsorNaam.length() != 0) {
            //willekeurig getal kleinder dan lengte van string:
            int index = random.nextInt(sponsorNaam.length());
            //karakter ophalen:
            char c = sponsorNaam.charAt(index);
            //string opnieuw samenstellen zonder karakter:
            sponsorNaam = sponsorNaam.substring(0, index) + sponsorNaam.substring(index + 1);
            //karakter toevoegen aan shuffledString:
            shuffledString += c;
        }
        return shuffledString;
    }
}
