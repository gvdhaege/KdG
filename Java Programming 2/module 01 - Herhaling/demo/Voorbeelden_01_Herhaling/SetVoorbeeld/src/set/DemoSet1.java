package set;

import java.util.HashSet;
import java.util.Set;

public class DemoSet1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

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
