package be.kdg.model;

/*
De klasse Maten bevat de attributen borstOmtrek, taille en heupOmtrek, alle van het type int.
Voorzie een default constructor waarin je aan borstOmtrek, taile en heupOmtrek de respectievelijke waarden 90, 60 en 90 toekent.
Voorzie ook een constructor met drie parameters waarmee je de drie attributen een waarde kunt geven.
Voorzie een toString-methode die een String in de vorm "Maten : borstomtrrek taille heupomtrek" teruggeeft.
 */
public class Maten {
    private int borstOmtrek;
    private int taille;
    private int heupOmtrek;

    public Maten() {
        borstOmtrek = 90;
        taille = 60;
        heupOmtrek = 90;
    }

    public Maten(int borstOmtrek, int taille, int heupOmtrek) {
        this.borstOmtrek = borstOmtrek;
        this.taille = taille;
        this.heupOmtrek = heupOmtrek;
    }

    public String toString() {
        return "Maten: " + borstOmtrek +  " "  + taille + " " + heupOmtrek;
    }
}

