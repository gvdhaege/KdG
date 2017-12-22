public class Vliegtuig {
    private VliegtuigType type;
    private String naam;
    private String maatschappij;

    public Vliegtuig(VliegtuigType type, String naam, String maatschappij) {
        this.type = type;
        this.naam = naam;
        this.maatschappij = maatschappij;
    }

    public VliegtuigType getType() {
        return type;
    }

    public String getNaam() {
        return naam;
    }

    public String getMaatschappij() {
        return maatschappij;
    }

    @Override
    public String toString() {
        return "Vliegtuig{" +
                "type=" + type +
                ", naam='" + naam + '\'' +
                ", maatschappij='" + maatschappij + '\'' +
                '}';
    }
}
