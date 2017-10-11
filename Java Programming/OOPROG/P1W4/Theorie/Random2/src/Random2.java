import java.util.Random;

public class Random2 {
    public static void main(String[] args) {
        Random random = new Random();

        double doubleEen = random.nextDouble();
        double doubleTwee = random.nextDouble();
        double doubleDrie = random.nextDouble();
        double doubleVier = random.nextDouble();
        double doubleVijf = random.nextDouble();

        Random eerste = new Random(42);
        Random tweede = new Random(42);

        System.out.printf("%.2f %.2f %.2f %.2f %.2f %n", doubleEen, doubleTwee, doubleDrie, doubleVier, doubleVijf);
        StringBuilder geheleGetallen = new StringBuilder();
        for (int i = 0; i < 20 ; i++) {
            if (i % 2 == 0) {
                geheleGetallen.append((eerste.nextInt(42) + 1) + " ");
            } else {
                geheleGetallen.append((tweede.nextInt(42) + 1) + " ");
            }
        }
        System.out.println(geheleGetallen);
    }
}
