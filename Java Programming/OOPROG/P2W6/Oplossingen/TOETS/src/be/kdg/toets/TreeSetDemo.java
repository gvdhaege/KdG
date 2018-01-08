package be.kdg.toets;

import java.util.*;

/**
 * @author Kristiaan Behiels
 * @version 1.0 1/12/13
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        List<Student> data = new ArrayList<>();
        data.add(new Student("Marieke", 13 ));
        data.add(new Student("Marjolein", 18));
        data.add(new Student("Marijke", 15));
        data.add(new Student("Marie Laure", 14));

        Set<Student> studenten = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
               return s2.getScore() - s1.getScore();
            }
        });
        studenten.addAll(data);

        for (Student student : studenten) {
            System.out.println(student);
        }
    }
}

/*
Marjolein    -> 18
Marijke      -> 15
Marie Laure  -> 14
Marieke      -> 13
*/