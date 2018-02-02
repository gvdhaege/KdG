package be.kdg.persoon;

/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */

/*
De bedoeling van deze klasse is ervoor te zorgen dat namen op een correcte manier gesorteerd worden. (zie voorbeeld van uitvoer)
De klasse Persoon moet een implements doen van Comparable<Persoon>.
Er zijn twee attributen, beide van het type string met de namen voornaam en familienaam.
Voorzie een constructor die beide attributen van een waarde voorziet.
Voorzie een toString methode die de familienaam gevolgd door een spatie gevolgd door de voornaam teruggeeft.
In de compareTo methode moet je tijdens het vergelijken alles omzetten naar kleine letters en daarna alle niet-letters uit de familienaam verwijderen.
Bij gelijke familienaam vergelijk je op voornaam.
 */
public class Persoon implements Comparable<Persoon> {
    private final String voornaam;
    private final String familieNaam;

    public Persoon(String voornaam, String familieNaam) {
        this.voornaam = voornaam;
        this.familieNaam = familieNaam;
    }

    public String toString() {
        return familieNaam + " " + voornaam;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Persoon persoon = (Persoon) object;
        return familieNaam.equals(persoon.familieNaam) && voornaam.equals(persoon.voornaam);
    }

    @Override
    public int hashCode() {
        int result = voornaam.hashCode();
        return 31 * result + familieNaam.hashCode();
    }

    @Override
    public int compareTo(Persoon anderePersoon) {
        String familie = equalize(familieNaam);
        String andereFamilie = equalize(anderePersoon.familieNaam);
        if (familie.equals(andereFamilie)) {
            return voornaam.compareTo(anderePersoon.voornaam);
        }
        return familie.compareTo(andereFamilie);
    }


    private String equalize(String string) {
        String lower = string.toLowerCase();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < lower.length(); i++) {
            char token = lower.charAt(i);
            if (Character.isLetter(token)) {
                builder.append(token);
            }
        }
        return builder.toString();
    }
}
