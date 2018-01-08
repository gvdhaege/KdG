package HashSet.Demo5;

import java.util.HashSet;

/**
 * Created by venj on 7/12/2014.
 */
public class Demo5 {
    public static void main(String[] args) {
        Student s1 = new Student("Jos", 48689);
        Student s2 = new Student("Jef", 46464);
        Student s3 = new Student("Maria", 39497);
        Student s4 = new Student("Francine", 39497);

        HashSet<Student> studentenSet = new HashSet<Student>();
        studentenSet.add(s1);
        studentenSet.add(s2);
        studentenSet.add(s3);
        studentenSet.add(s4);

        System.out.println(studentenSet.size());
        for (Student student : studentenSet) {
            System.out.println(student);
        }
    }
}
