package be.kdg.contact;

/*
De klasse Contactgevens bevat drie attributen:
 	Een String voor de het e-mailadres van de contactpersoon
 	Een Telefoon-object voor de vaste telefoon
  	Een Telefoon-object voor de mobiele telefoon (GSM)

	Voorzie een constructor die een nieuw Contactgegevens-object op basis van de drie gegevens parameters (e-mailadres, vast telefoonnummer en gsm-nummer) maakt .
    Voor beide telefoonnummers wordt een nieuw Telefoon-object gemaakt.
	Voorzie getters voor alle attributen.
	Voorzie een toString-methode die een String teruggeeft met telkens op een volgende regel, het e-mailadres, het vast telefoonnummer en het gsm-nummer.

 	Bijvoorbeeld:
          E-mail: jos.ergens@where.com
  		  Tel: 014785031
  		  GSM: 0497732501
 */

public class ContactGegevens {
    private String eMail;
    private Telefoon telefoon;
    private Telefoon gsm;

    public ContactGegevens(String eenEmailAdres, String eenNummer, String eenGsmNummer) {
        eMail = eenEmailAdres;
        telefoon = new Telefoon("vast", eenNummer);
        gsm = new Telefoon("mobiel", eenGsmNummer);
    }

    public String getEMail() {
        return eMail;
    }

    public Telefoon getTelefoon() {
        return telefoon;
    }

    public Telefoon getGsm() {
        return gsm;
    }

    public String toString() {
        return " E-mail: " + eMail + "\n Tel: " + telefoon.getNummer() + "\n Gsm: " + gsm.getNummer();
    }
}
