public class TestPiloten {
    public static void main(String[] args) {
        Piloten piloten = new Piloten();
        System.out.println(piloten.toonPiloten());
        System.out.println("\nPiloot met snelste tijd:");
        System.out.println(piloten.pilootMetDeSnelsteTijd());
        System.out.println("\nPiloot met traagste tijd:");
        System.out.println(piloten.pilootMetDeTraagsteTijd());
        System.out.println("\nKlassement:");
        System.out.println(piloten.toonGesorteerdVolgensTijd());
    }
}