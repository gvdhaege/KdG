public class Frequenties {
    public static void main(String[] args) {
        final int CIJFERS = 10;
        int[] getallen = {
                8, 4, 0, 7, 3, 4, 4, 7, 7, 1,
                9, 1, 9, 6, 3, 1, 5, 5, 0, 2,
                5, 3, 4, 1, 2, 1, 3, 1, 4, 0,
                8, 8, 2, 6, 4, 8, 8, 0, 3, 3,
                5, 1, 4, 2, 5, 9, 3, 6, 2, 0
        };

        int[] frequenties = new int[CIJFERS];

        for (int getal : getallen){
            frequenties[getal]++;
        }
        System.out.print("Frequenties: + \n");
        for (int i = 0; i < CIJFERS; i++) {
            System.out.println(i + " --> " + frequenties[i]);
        }
    }
}
