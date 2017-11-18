package be.kdg.persoon;

/**
 * @author Kristiaan Behiels
 * @version 1.0 24/10/13
 */
public class Student extends Persoon {
    private int studentNummer;

    public Student(int id, String naam, int studentNummer) {
        super(id, naam);
        this.studentNummer = studentNummer;
    }

    @Override
    public String toString() {
        return String.format("%s %6d", super.toString(), studentNummer);
    }
}
