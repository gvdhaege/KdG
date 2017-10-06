/**
 * @author Steven Excelmans
 * @version 1.0 6/10/2017 12:20
 */
public class While3 {
    public static void main(String[] args) {
        int i = 1;
        double macht = 0;

        while (macht < 10000){
            macht = Math.pow(5, i);
            if (macht < 10000){
                System.out.print(macht + " ");
            }
            i++;
        }
    }
}

