/**
 * @author Steven Excelmans
 * @version 1.0 6/10/2017 12:14
 */
public class While {
    public static void main(String[] args) {
        int ondergrens = 100;
        int bovengrens = 120;


        while (bovengrens >= ondergrens) {
            System.out.print(bovengrens + " ");
            bovengrens--;
        }
    }
}
