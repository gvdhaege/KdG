import java.util.SortedSet;

public class RunStudenten {
    public static void main(String[] args) {
        Studenten studenten = new Studenten();
        System.out.println("Overzicht resultaten:");
        System.out.println(studenten);
        SortedSet<Student> set = studenten.getStudenten();
        System.out.print("Hoogste score: ");
        System.out.print(studenten.getStudenten().first());
        System.out.print("\nLaagste score: ");
        System.out.print(studenten.getStudenten().last());
// Druk hier met één regel de student met de hoogste score af
// Druk hier met één regel de student met de laagste score af.
    }
}
