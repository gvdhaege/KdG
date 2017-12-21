import java.util.*;

public class HashSetOpdracht {
    public static void main(String[] args) {
        String[] girls = {"An", "Bea", "Bea", "Diana", "Zoë", "Katleen", "Kristin", "Bea", "Kristin", "Gertrude"};

        Set<String> girlSet = new HashSet<>(Arrays.asList(girls));

        System.out.println(girlSet.toString());
        for (String s : girlSet) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (int i = 0; i < girlSet.size(); i++) {
            System.out.print(girlSet.toArray()[i] + " ");
        }
        System.out.println();
        for (Iterator<String> iterator = girlSet.iterator(); iterator.hasNext(); ) {
            System.out.print(iterator.next() + " ");
        }
    }
}
