public class Data {
    private final static int AANTAL = 15;
    private int[] getallen = new int[AANTAL];

    public Data() {
        for (int i = 0; i < AANTAL; i++) {
            getallen[i] = (i + 10);
        }
    }

    public void printEvenGetallen(){
        EvenIterator evenIterator = new EvenIterator() {
            @Override
            public void printGetallen() {
                for (int getal : getallen){
                    if (getal % 2 == 0){
                        System.out.println(getal + " ");
                    }
                }
            }
        };
        evenIterator.printGetallen();
        System.out.println();
    }
}