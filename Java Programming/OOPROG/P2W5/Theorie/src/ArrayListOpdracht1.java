import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListOpdracht1 {
    public static void main(String[] args) {
        List<String> namen = new ArrayList<>();

        namen.add("Albert");
        namen.add("Hendrik");
        namen.add("Jozefien");
        namen.add("Annabel");
        namen.add("Adelbert");

        System.out.println(namen.get(0));
        System.out.println(namen.get(4));

        System.out.println();

        for (String naam : namen) {
            System.out.println(naam);
        }

        System.out.println();

        System.out.println(namen.contains("Joske"));

        System.out.println();

        Iterator<String> namenMetA = namen.iterator();

        while (namenMetA.hasNext()){
            if (namenMetA.next().toLowerCase().startsWith("a")){
                namenMetA.remove();
            }
        }

        for (String naam : namen) {
            System.out.println(naam);
        }

    }
}
