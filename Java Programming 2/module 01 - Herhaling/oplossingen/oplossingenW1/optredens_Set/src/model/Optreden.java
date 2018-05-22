package model;

public class Optreden implements Comparable<Optreden>{
    private String naam;
    private String podium;
    private int uur;
    private int min;
    private int sterren;

    public Optreden(String naam, String podium, int uur, int min, int sterren) {
        this.naam = naam;
        this.podium = podium;
        this.uur = uur;
        this.min = min;
        this.sterren = sterren;
    }

    @Override
    public String toString() {
        StringBuilder sb =  new StringBuilder(naam);
        sb.append(" (");
        sb.append(podium);
        sb.append(", ");
        sb.append(uur);
        sb.append("u");
        if(min > 0) sb.append(min);
        sb.append(")--> ");
        for(int i = 0; i < sterren; i++) {
            sb.append("*");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Optreden optreden = (Optreden) o;

        if (naam != null ? !naam.equals(optreden.naam) : optreden.naam != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return naam != null ? naam.hashCode() : 0;
    }

    @Override
    public int compareTo(Optreden o) {
        return this.naam.compareTo(o.naam);

    }
}
