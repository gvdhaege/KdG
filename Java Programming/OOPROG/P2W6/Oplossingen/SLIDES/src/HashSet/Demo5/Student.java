package HashSet.Demo5;

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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Student student = (Student) object;
        return studentNummer == student.studentNummer;
    }

    // hashCode ontbreekt!

    @Override
    public String toString() {
        return String.format("%s (%d)", naam, studentNummer);
    }
}

/*
4
Jef (46464)
Francine (39497)
Jos (48689)
Maria (39497)
*/