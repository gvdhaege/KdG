/**
 * @author Steven Excelmans
 * @version 1.0 6/10/2017 12:54
 */
public class Reeksen {
    public static void main(String[] args) {
        int x = 0;

        for (int i = 0; i < 10; i++) {
            x++;
            int result = (int) Math.pow(x, 3) - (int) Math.pow(x, 2) + 1 ;
            System.out.print(result + " ");

        }
        System.out.print(".");
    }
}
