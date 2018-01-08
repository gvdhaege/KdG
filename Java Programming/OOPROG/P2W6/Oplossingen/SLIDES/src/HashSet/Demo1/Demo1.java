package HashSet.Demo1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by venj on 7/12/2014.
 */
public class Demo1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("rood");
        set.add("wit");
        set.add("blauw");
        set.add("groen");
        set.add("groen");
        set.add("grijs");
        set.add("wit");
        set.add("oranje");
        set.add("rood");

        System.out.printf("Aantal kleuren: %d%n", set.size());

        Iterator<String> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.printf("%s ", setIterator.next());
        }
    }
}

/*
Aantal kleuren: 6
wit oranje rood grijs groen blauw
 */
