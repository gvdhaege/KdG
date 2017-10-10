/**
 * @author Steven Excelmans
 * @version 1.0 6/10/2017 21:22
 */
public class Hexadecimaal {
    public static void main(String[] args) {

        for (int i = 0; i < 16 ; i++) {
            System.out.print(Integer.toHexString(i).toUpperCase() + " ");
        }
    }
}
