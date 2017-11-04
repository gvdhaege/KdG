public class StaafDiagram {
    public static void main(String[] args) {
        int[] getallen = {
                12, 17, 14, 18, 13, 13, 14, 17, 17, 16,
                10, 18, 13, 18, 12, 12, 10, 17, 10, 15,
                10, 11, 16, 12, 16, 11, 8, 10, 16, 14,
                17, 7, 11, 10, 15, 10, 14, 8, 8, 14
        };
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        for (int getal : getallen) {
            if (getal < minimum) minimum = getal;
            if (getal > maximum) maximum = getal;
        }
        int aantalStaven = maximum - minimum + 1;

        int[] staven = new int[aantalStaven];

        for (int getal : getallen) {
            staven[getal - minimum]++;
        }

        for (int i = 0; i < staven.length; i++) {
            System.out.printf("%2d: ", minimum + i);
            for (int j = 0; j < staven[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
