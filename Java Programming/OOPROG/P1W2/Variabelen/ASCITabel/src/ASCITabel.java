/**
 * @author Steven Excelmans
 * @version 1.0 1/10/2017 19:11
 */
public class ASCITabel {
    public static void main(String[] args) {

        int counter = 0;

        for (int i = 32; i <= 255; i++) {
            char ch = (char) i;
            System.out.printf("%5c (%3d)", ch, i);
//            System.out.print(ch + " ( " + i + ")" + "\t\t");
            if (counter++ == 6){
                counter = 0;
                System.out.println();
            }
        }
    }
}

