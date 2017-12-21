public class Bewerkingen {
    private int getalEen;
    private int getalTwee;
    private int[] lijst= new int[4];

    public Bewerkingen(int getalEen, int getalTwee) {
        this.getalEen = getalEen;
        this.getalTwee = getalTwee;
    }

    public void doeBewerkingen() throws ArithmeticException {
        lijst[0] = getalEen + getalTwee;
        lijst[1] = getalEen - getalTwee;
        lijst[2] = getalEen * getalTwee;
        lijst[3] = getalEen / getalTwee;
    }

    public void toonResultaat(){
        for (int i : lijst) {
            System.out.print(i + " ");
        }
    }
}
