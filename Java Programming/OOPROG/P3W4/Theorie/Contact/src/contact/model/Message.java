package contact.model;

public class Message {
    private final String voornaam;
    private final String naam;
    private final String email;
    private final String bericht;

    public Message(String voornaam, String naam, String email, String bericht) {
        this.voornaam = voornaam;
        this.naam = naam;
        this.email = email;
        this.bericht = bericht;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public String getEmail() {
        return email;
    }

    public String getBericht() {
        return bericht;
    }
}
