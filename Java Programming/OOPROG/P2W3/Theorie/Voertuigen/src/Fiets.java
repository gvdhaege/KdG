public class Fiets extends Voertuig {
    private String fietsbelGeluid;

    public Fiets(String fietsbelGeluid) {
        super(2);
        this.fietsbelGeluid = fietsbelGeluid;
    }

    public String getFietsbelGeluid() {
        return fietsbelGeluid;
    }
}
