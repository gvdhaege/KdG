public class ContactGegevens {
    private String email;
    private Telefoon telefoon;
    private Telefoon gsm;

    public ContactGegevens(String email, String telefoon, String gsm) {
        this.email = email;
        this.telefoon = new Telefoon("vast", telefoon);
        this.gsm = new Telefoon("mobiel", gsm);
    }

    public String getEmail() {
        return email;
    }

    public Telefoon getTelefoon() {
        return telefoon;
    }

    public Telefoon getGsm() {
        return gsm;
    }

    @Override
    public String toString() {
        return "E-mail:" + email + "\n" +
                "Tel.:" + telefoon + "\n" +
                "GSM:" + gsm;
    }
}
