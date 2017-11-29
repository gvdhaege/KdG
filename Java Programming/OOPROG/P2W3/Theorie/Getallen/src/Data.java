public class Data {
    private final static int AANTAL = 15;
    private int[] getallen = new int[AANTAL];

    public Data(){
        for (int i = 0; i < AANTAL ; i++) {
            getallen[i] = (i + 10);
        }
    }

    private class InnerEvenIterator {
        private int next;

        public boolean hasNext() {
            return next < AANTAL;
        }

        public int getNext() {
            for (int getal : getallen){
                if (getal % 2 == 0){
                    System.out.println(getal + " ");
                    next++;
                }
            }
            return next;
        }
    }

    public void printEvenGetallen() {
        InnerEvenIterator iterator = new InnerEvenIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.getNext() + " ");
        }
    }
}
