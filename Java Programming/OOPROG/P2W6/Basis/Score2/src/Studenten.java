import java.util.*;

public class Studenten {
    private List<Student> data = new ArrayList<>();

    public Studenten() {
        data.add(new Student("Marieke", 13));
        data.add(new Student("Marjolein", 18));
        data.add(new Student("Marijke", 15));
        data.add(new Student("Marie Laure", 14));
    }

    public String getScores() {
        Set<Student> studenten = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o2.getScore(), o1.getScore());
            }
        });
        studenten.addAll(data);
        StringBuilder sb = new StringBuilder();
        for (Student student : studenten) {
            sb.append(student).append("\n");
        }
        return sb.toString();
    }
}
