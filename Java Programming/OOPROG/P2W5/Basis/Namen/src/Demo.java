public class Demo {
    public static void main(String[] args) {
        VerwerkData verwerkData = new VerwerkData();

        verwerkData.sorteerVolgensNaam();
        System.out.println("Volgens naam:");
        verwerkData.toon();

        verwerkData.sorteerVolgensVoornaam();
        System.out.println("\nVolgens voornaam:");
        verwerkData.toon();
    }
}
