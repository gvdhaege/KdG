package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoSet2 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("een");
        set.add("twee");
        set.add("drie");
        set.add("vier");
        set.add(new String("twee"));  // object reeds aanwezig!

        for (String string : set) {
            System.out.print(string + " ");
        }
    }   // een twee drie vier --> geordend
}