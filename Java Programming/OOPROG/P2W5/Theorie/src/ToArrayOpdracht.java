import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToArrayOpdracht {
    public static void main(String[] args) {
        final int AANTAL = 20;
        Random random = new Random();
        List<Integer> getallenList = new ArrayList<>();

        for (int i = 0; i < AANTAL; i++) {
            getallenList.add(random.nextInt(50) + 1);
        }

        System.out.println(getallenList);

        Integer[] getallenArray = getallenList.toArray(new Integer[0]);
        for (Integer getal : getallenArray){
            System.out.print(getal + " ");
        }
        System.out.println();

        List<Integer> evenGetallen = new ArrayList<>();

        for (int i = 0; i < getallenArray.length ; i++) {
            if (getallenArray[i] % 2 == 0){
                evenGetallen.add(getallenArray[i]);
            }
        }
        System.out.println(evenGetallen);
    }
}
