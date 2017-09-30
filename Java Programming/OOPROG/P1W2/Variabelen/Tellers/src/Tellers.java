/**
 * @author Steven Excelmans
 * @version 1.0 30/09/2017 12:46
 */
public class Tellers {

    public static void main(String[] args) {

        final int AANTAL = 10;
        int optellen = 1;
        int aftrekken = 10;

        while(optellen <= AANTAL){
            System.out.println(optellen++ + " - " + aftrekken--);
        }
    }
}
