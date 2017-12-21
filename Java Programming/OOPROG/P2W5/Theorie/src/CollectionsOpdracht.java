import java.util.*;

public class CollectionsOpdracht {
    public static void main(String[] args) {
        Integer[] getallen = new Integer[40];
        Random random = new Random();

        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = random.nextInt(50);
        }

        List<Integer> getallenLL = new LinkedList<>(Arrays.asList(getallen));

        Collections.sort(getallenLL);
        System.out.println(getallenLL);
        Collections.reverse(getallenLL);
        System.out.println(getallenLL);
        Collections.shuffle(getallenLL);
        System.out.println(getallenLL);
        System.out.println(Collections.max(getallenLL));
        System.out.println(Collections.min(getallenLL));
        System.out.println(Collections.frequency(getallenLL, 49));
        Collections.fill(getallenLL, 49);
        System.out.println(getallenLL);
        System.out.println(Collections.frequency(getallenLL, 49));


    }
}
