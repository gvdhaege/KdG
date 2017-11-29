public class Main {
    public static void main(String[] args) {
        Printer mijnPrinter = new Printer() {
            @Override
            public void printData(String dataToPrint) {
                System.out.println(dataToPrint);
            }
        };
        mijnPrinter.printData("Deze tekst moet afgedrukt worden");
    }
}
