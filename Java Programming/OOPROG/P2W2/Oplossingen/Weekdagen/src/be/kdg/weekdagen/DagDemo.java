package be.kdg.weekdagen;

/**
 * @author Kristiaan Behiels
 * @version 1.0 29/10/13
 */
public class DagDemo {
    public static void main(String[] args) {
        for (Dag dag : Dag.values()) {
            System.out.println(dag.name());
            System.out.println(dag.ordinal());
            System.out.println(dag);
        }
    }
}

/*
MAANDAG
0
maandag(weekdag)
DINSDAG
1
dinsdag(weekdag)
WOENSDAG
2
woensdag(weekdag)
DONDERDAG
3
donderdag(weekdag)
VRIJDAG
4
vrijdag(weekdag)
ZATERDAG
5
zaterdag(weekend)
ZONDAG
6
zondag(weekend)
*/