package be.kdg.scores3;

import java.util.*;

/**
 * @author Kristiaan Behiels
 * @version 1.0 1/12/13
 */
public class Studenten {
    private SortedSet<Student> studenten = new TreeSet<>(new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s2.getScore() - s1.getScore();
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
        StringBuilder builder = new StringBuilder();
        for (Student student : studenten) {
            builder.append(student).append('\n');
        }
        return builder.toString();
    }
}
