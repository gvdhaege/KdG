package leden;

public class Leden {
    private final int MAX_AANTAL = 100;
    private int aantal;
    private Lid[] leden = new Lid[MAX_AANTAL];

    public void voegLidToe(Lid lid) {
        leden[aantal++] = lid;
    }

    public Lid getLid(int index) {
        return leden[index];
    }

    public int size() {
        return aantal;
    }
}
