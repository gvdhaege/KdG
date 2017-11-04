public class Kwadraten {
    public static void main(String[] args) {
        int[] getallen = new int[10];

        for (int i = 0; i < 10 ; i++) {
            getallen[i] = (i + 1) * (i + 1);
        }

        for (int getal : getallen){
            System.out.print(getal + " ");
        }
    }
}
