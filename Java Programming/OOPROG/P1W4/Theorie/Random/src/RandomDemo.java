import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        int getal = random.nextInt(6) + 1;
        int getalTwee = random.nextInt(6) + 1;
        int getalDrie = random.nextInt(6) + 1;
        int getalVier = random.nextInt(6) + 1;
        int getalVijf = random.nextInt(6) + 1;

        boolean een = random.nextBoolean();
        boolean twee = random.nextBoolean();
        boolean drie = random.nextBoolean();
        boolean vier = random.nextBoolean();

        double flipCoinEen = random.nextDouble();
        double flipCoinTwee = random.nextDouble();
        double flipCoinDrie = random.nextDouble();

        System.out.printf("%d %d %d %d %d %n", getal, getalTwee, getalDrie, getalVier, getalVijf);
        System.out.printf("%b %b %b %b %n", een, twee, drie, vier);
        System.out.printf("%f %f %f %n", flipCoinEen, flipCoinTwee, flipCoinDrie);

    }
}
