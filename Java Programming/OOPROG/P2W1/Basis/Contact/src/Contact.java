public class Contact {
    private String naam;
    private ContactGegevens gegevens;

    public Contact(String naam, String email, String telefoon, String gsm) {
        this.naam = naam;
        this.gegevens = new ContactGegevens(email, telefoon, gsm);
    }

    @Override
    public String toString() {
        return "Naam:" + naam + "\n" + gegevens.toString();
    }

    public void toonInfo() {
        System.out.println("Naam: " + naam);
        System.out.println("E-mail: " + gegevens.getEmail());
        System.out.println("Tel: " + gegevens.getTelefoon().getNummer());
        System.out.println("Gsm: " + gegevens.getGsm().getNummer());
    }
}
