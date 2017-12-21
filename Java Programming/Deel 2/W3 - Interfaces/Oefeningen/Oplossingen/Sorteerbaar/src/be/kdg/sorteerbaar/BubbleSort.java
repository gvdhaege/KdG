package be.kdg.sorteerbaar;

public class BubbleSort {
    public static void sort(Sorteerbaar[] tabel) {
        int n = tabel.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tabel[j + 1].kleinerDan(tabel[j])) {
                    Sorteerbaar temp = tabel[j + 1];
                    tabel[j + 1] = tabel[j];
                    tabel[j] = temp;
                }
            }
        }
    }

    public static void sortReversed(Sorteerbaar[] tabel) {
        int n = tabel.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tabel[j + 1].groterDan(tabel[j])) {
                    Sorteerbaar temp = tabel[j + 1];
                    tabel[j + 1] = tabel[j];
                    tabel[j] = temp;
                }
            }
        }
    }
}
