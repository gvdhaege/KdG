package be.kdg.scores2;


import java.util.*;

/**
 * @author Kristiaan Behiels
 * @version 1.0 1/12/13
 */
public class Studenten {
    private List<Student> data = new ArrayList<>();

    public Studenten() {
        data.add(new Student("Marieke", 13 ));
        data.add(new Student("Marjolein", 18));
        data.add(new Student("Marijke", 15));
        data.add(new Student("Marie Laure", 14));
    }

    // Maak gebruik van een TreeSet in combinatie met een Comparator!
    public String getScores() {
        Set<Student> studenten = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getScore() - s1.getScore();
            }
        });
        studenten.addAll(data);

        StringBuilder builder = new StringBuilder();
        for (Student student : studenten) {
            builder.append(student).append('\n');
        }
        return builder.toString();
    }
}
