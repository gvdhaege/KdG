import java.util.Random;

/**
 * @author Steven Excelmans
 * @version 1.0 6/10/2017 11:56
 */
public class Expressies {

    public static void main(String[] args) {

//        int getal = 10;
//        int teller = 0;
//        while (getal > 0){
//            while (teller < 10){
////                int i = 42;
//                teller++;
//                System.out.print(teller + " ");
//            }
////            i--;
//            getal--;
//        }
//        System.out.println();
//        System.out.println("Teller = " + teller);
//        System.out.println("Getal = " + getal);

        Random random = new Random();

        int dobbelsteen = random.nextInt(6) +1;
        int fouteDobbelsteen = random.nextInt(6);
        System.out.println(dobbelsteen);
        System.out.println(fouteDobbelsteen);
        int muntstuk = random.nextInt(2);

        System.out.println(muntstuk);

    }
}
