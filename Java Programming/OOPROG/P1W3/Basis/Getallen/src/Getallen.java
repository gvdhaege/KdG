/**
 * @author Steven Excelmans
 * @version 1.0 6/10/2017 21:09
 */
public class Getallen {
    public static void main(String[] args) {
        for (int i = -10; i <= 10; i++) {
            System.out.print(((i < 1) ? "" : "+") + i + " ");
        }
    }
}
