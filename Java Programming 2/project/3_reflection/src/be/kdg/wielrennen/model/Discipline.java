package be.kdg.wielrennen.model;

public enum Discipline {
    BMX("BMX"), CYCLOCROSS("Cyclocross"), MTB("MTB"), PISTE("Piste"), RACE("Race");

    private String naam;

    Discipline(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return naam;
    }
}
