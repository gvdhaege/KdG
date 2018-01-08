import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Studenten {
    private List<Student> data = new ArrayList<>();

    public Studenten() {
        data.add(new Student("Marieke", 13));
        data.add(new Student("Marjolein", 18));
        data.add(new Student("Marijke", 15));
        data.add(new Student("Marie Laure", 14));
    }

    public String getScores() {
        Set<Student> studenten = new TreeSet<>(data);
        StringBuilder sb = new StringBuilder();
        for (Student student : studenten) {
            sb.append(student).append("\n");
        }
        return sb.toString();
    }
}
