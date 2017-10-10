import java.util.Random;

/**
 * @author Steven Excelmans
 * @version 1.0 9/10/2017 19:24
 */
public class LottoGetallen {
    public static void main(String[] args) {
        Random random = new Random();

        int een = random.nextInt(45) + 1;
        int twee = random.nextInt(45) + 1;
        int drie = random.nextInt(45) + 1;
        int vier = random.nextInt(45) + 1;
        int vijf = random.nextInt(45) + 1;
        int zes = random.nextInt(45) + 1;
        int zeven = random.nextInt(45) + 1;
        int acht = random.nextInt(45) + 1;
        int negen = random.nextInt(45) + 1;
        int tien = random.nextInt(45) + 1;

        System.out.println(een);
        System.out.println(twee);
        System.out.println(drie);
        System.out.println(vier);
        System.out.println(vijf);
        System.out.println(zes);
        System.out.println(zeven);
        System.out.println(acht);
        System.out.println(negen);
        System.out.println(tien);
    }
}
