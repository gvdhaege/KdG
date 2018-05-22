package set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet3 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("een");
        set.add("twee");
        set.add("drie");
        set.add("vier");
        set.add(new String("twee"));  // object reeds aanwezig!

        for (String string : set) {
            System.out.print(string + " ");
        }
    }   // vier een drie twee	   <- ongeordend
}