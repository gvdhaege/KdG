public class Verdeling {
    private int een;
    private int twee;
    private int drie;
    private int vier;
    private int vijf;
    private int zes;

    private int aantal;

    public void voegWaardeToe(int waarde) {
        switch (waarde) {
            case 1:
                een++;
                break;
            case 2:
                twee++;
                break;
            case 3:
                drie++;
                break;
            case 4:
                vier++;
                break;
            case 5:
                vijf++;
                break;
            case 6:
                zes++;
        }
        aantal++;
    }

    public void reset() {
        aantal = een = twee = drie = vier = vijf = zes = 0;
    }

    public double gemiddeldeWaarde() {
        return (een + twee * 2 + drie * 3 + vier * 4 + vijf * 5 + zes * 6) / (double) aantal;
    }

    public String toonVerdeling() {
        return "Een: " + een + "\nTwee: " + twee + "\nDrie: " + drie + "\nVier: " +
                vier + "\nVijf: " + vijf + "\nZes: " + zes;
    }
}
