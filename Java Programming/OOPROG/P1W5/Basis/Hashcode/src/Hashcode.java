import java.util.Random;

public class Hashcode {
    public static void main(String[] args) {
        final int MAX = 20;
        int[] getallen = new int[MAX];
        int[] hashcodes = new int[MAX];

        Random generator = new Random();

        for (int i = 0; i < MAX ; i++) {
            getallen[i] = generator.nextInt(900) + 100;
            System.out.print(getallen[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < MAX ; i++) {
            hashcodes[i] =  getallen[i] % 10;
            System.out.print(hashcodes[i] + " ");
        }
    }
}
