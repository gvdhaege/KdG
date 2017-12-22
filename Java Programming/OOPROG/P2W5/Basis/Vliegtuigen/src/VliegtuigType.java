public class VliegtuigType {
    private String code;
    private String omschrijving;

    public VliegtuigType(String code, String omschrijving) {
        this.code = code;
        this.omschrijving = omschrijving;
    }

    public String getCode() {
        return code;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    @Override
    public String toString() {
        return "VliegtuigType{" +
                "code='" + code + '\'' +
                ", omschrijving='" + omschrijving + '\'' +
                '}';
    }
}
