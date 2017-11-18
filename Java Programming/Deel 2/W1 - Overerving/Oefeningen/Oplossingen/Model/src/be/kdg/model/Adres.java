package be.kdg.model;

/*
De klasse Adres bevat 3 parameters, straat en gemeente van het type String, postNummer van het type int.
Voorzie een default construtor waarin je beide String-attributen van een lege string voorziet.
Voorzie een methode setAdres waarmee je de inhoud van alle drie de attributen in één keer kunt wijzigen.
Voorzie een toString methode om het adres in de vorm "Adres: straat postNummer gemeente af te drukken.
Indien er geen straat is ingevuld moet de toString methode "Adres onbekend" teruggeven.
 */
public class Adres {
    private String straat;
    private int postNummer;
    private String gemeente;

    public Adres() {
        straat = "";
        gemeente = "";
    }

    public Adres(String straat, int postNummer, String gemeente) {
        this.straat = straat;
        this.postNummer = postNummer;
        this.gemeente = gemeente;
    }

    public void setAdres(String straat, int postNummer, String gemeente) {
        this.straat = straat;
        this.postNummer = postNummer;
        this.gemeente = gemeente;
    }

    public String toString() {
        String string = "Adres: ";
        if (straat.isEmpty()) {
            string += "adres onbekend";
        } else {
            string += straat + " " + postNummer + " " + gemeente;
        }
        return string;
    }
}
