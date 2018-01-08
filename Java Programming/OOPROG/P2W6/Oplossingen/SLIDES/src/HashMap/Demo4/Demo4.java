package HashMap.Demo4;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by venj on 7/12/2014.
 */
public class Demo4 {
    public static void main(String[] args) {
        Student s1 = new Student("Jos", 48689);
        Student s2 = new Student("Jef", 46464);
        Student s3 = new Student("Maria", 39497);
        Student s4 = new Student("Francine", 39497);

        Map<Student, String> studentMap = new HashMap<>();
        studentMap.put(s1, "Doet het goed");
        studentMap.put(s2, "Moet eens wat meer moeite doen");
        studentMap.put(s3, "Natuurtalent");
        studentMap.put(s4, "Die stopt er beter mee");

        System.out.println(studentMap.size());
        System.out.println(studentMap.get(s1));
        System.out.println(studentMap.get(s2));
        System.out.println(studentMap.get(s3));
        System.out.println(studentMap.get(s4));
    }
}

/*
3
Doet het goed
Moet eens wat meer moeite doen
Die stop er beter mee
Die stop er beter mee
*/