package be.kdg.contact;

/*
De klasse Contact bevat twee attributen:
    Een string voor de naam van de contactpersoon
 	Een ContactGegevens-object voor de contactgegevens.

	Voorzie een constructor die aan het attribuut 'naam' een waarde toekent via de eerste parameter en
    een ContactGegevensobject maakt op basis  van de overige parameters (e-mailadres, telefoonnummer (vast) en gsm-nummer.

	Voorzie een toString-methode die alle gegevens van een contact af in de vorm van een String teruggeeft.
    Eerst een regel voor de naam en vervolgens telkens een regel voor een telefoonnummer en voor het e-mailadres.
    Voor de afdruk van de drie laatste regels maak je gebruik van de toString-methode van het ContactGegevens-object.

     Voorzie een methode om print alle gegevens van een contact af te drukken. 
     Eerst een regel voor de naam en vervolgens telkens een regel voor een telefoonnummer en voor het e-mailadres.
     Voor de afdruk maak je gebruik van vier afzonderlijke System.out.println-statements
 */
public class Contact {
    private String naam;
    private ContactGegevens gegevens;

    public Contact(String eenNaam, String eenEmailAdres,
                   String eenNummer, String eenGsmNummer) {
        naam = eenNaam;
        gegevens = new ContactGegevens(eenEmailAdres, eenNummer, eenGsmNummer);
    }

    public String toString() {
        return "Naam:" + naam + "\n" + gegevens.toString();
    }

    public void toonInfo() {
        System.out.println("Naam: " + naam);
        System.out.println("E-mail: " + gegevens.getEMail());
        System.out.println("Tel: " + gegevens.getTelefoon().getNummer());
        System.out.println("Gsm: " + gegevens.getGsm().getNummer());
        // Opmerking: in de twee laatste regels wordt er gezondigd tegen
        // de wet van Demeter: never talk to strangers!
    }
}

