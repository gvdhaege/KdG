import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Studenten {
    SortedSet<Student> studenten = new TreeSet<>(new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o2.getScore(), o1.getScore());
        }
    });

    public Studenten() {
        studenten.add(new Student("Marieke", 13));
        studenten.add(new Student("Marjolein", 18));
        studenten.add(new Student("Marijke", 15));
        studenten.add(new Student("Marie Laure", 14));
    }

    public SortedSet<Student> getStudenten() {
        return studenten;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Student student : studenten) {
            sb.append(student).append("\n");
        }
        return sb.toString();
    }
}

