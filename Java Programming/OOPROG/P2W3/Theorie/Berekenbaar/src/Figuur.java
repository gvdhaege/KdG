public abstract class Figuur implements Berekenbaar, Herschaalbaar {
    private String soort;

    protected Figuur(String soort) {
        this.soort = soort;
    }

    @Override
    public String toString() {
        return "Soort: \"" + soort + "\" ";
    }
}
