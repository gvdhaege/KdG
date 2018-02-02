import java.time.format.DateTimeFormatter;

public class DagDemo {
    public static void main(String[] args) {
        for (Dag dag : Dag.values()){
            System.out.println(dag.name());
            System.out.println(dag.ordinal());
            System.out.println(dag);
        }
    }
}
