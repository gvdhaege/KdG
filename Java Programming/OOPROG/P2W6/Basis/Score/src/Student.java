import java.util.Objects;

public class Student implements Comparable<Student> {
    private String naam;
    private int score;

    public Student(String naam, int score) {
        this.naam = naam;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("%-15s -> %d", naam, score);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score &&
                Objects.equals(naam, student.naam);
    }

    @Override
    public int hashCode() {

        return Objects.hash(naam, score);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.score, score);
    }
}
