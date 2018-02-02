package dragers;

public enum Drager {
    BLU_RAY("Blu Ray"), DVD("DVD");
    private String naam;

    Drager(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return naam;
    }
}

