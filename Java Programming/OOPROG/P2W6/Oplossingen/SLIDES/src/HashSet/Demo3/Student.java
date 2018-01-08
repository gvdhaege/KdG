package HashSet.Demo3;

/**
 * Created by venj on 7/12/2014.
 */
public class Student {
    private String naam;
    private int studentNummer;

    public Student(String naam, int studentNummer) {
        this.naam = naam;
        this.studentNummer = studentNummer;
    }

    // equals ontbreekt!

    @Override
    public int hashCode() {
        return studentNummer;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", naam, studentNummer);
    }
}
