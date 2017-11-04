public class SplitsTabel {
    public static void main(String[] args) {
        int[] tabel = {
                14, 18, 31, 84, 57, 61, 27, 90, 55, 21,
                30, 15, 43, 42, 19, 20, 69, 54, 35, 18
        };
        int helft = tabel.length / 2;
        int[] tabelEen = new int[helft];
        int[] tabelTwee = new int[helft];

        for (int i = 0; i < helft ; i++) {
            tabelEen[i] = tabel[i];
            System.out.printf("%4d", tabelEen[i]);
        }
        System.out.println();
        for (int i = helft, j = 0; i < tabel.length ; i++, j++) {
            tabelTwee[j] = tabel[i];
            System.out.printf("%4d", tabelTwee[j]);
        }
        System.out.println();
        for (int i = 0; i < tabel.length * 2; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < helft ; i++) {
            System.out.printf("%4d",tabelEen[i] + tabelTwee[i]);
        }

    }
}