/**
 * @author Steven Excelmans
 * @version 1.0 6/10/2017 13:37
 */
public class Faculteit {
    public static void main(String[] args) {
        long faculteit = 1L;

        for (int i = 1; i <= 20; i++) {
            faculteit *= i;
            System.out.println(i + "! --> " + faculteit);
        }
    }
}
