public class RunPiloten {
    public static void main(String[] args) {
        Piloten piloten = new Piloten();
        System.out.println(piloten); // Ter controle
        System.out.print("Kampioen met de meeste titels: ");
        Piloot kampioen = piloten.meesteWereldTitels();
        System.out.print(kampioen.getNaam() + ": " + kampioen.getTitels());
        System.out.println();
        System.out.print("Brazilaanse kampioenen: ");
        for (Piloot piloot : piloten.zoekOpNationaliteit("Braziliaans")) {
            System.out.print("\"" + piloot.getNaam() + "\" ");
        }
        System.out.println('\n');
        System.out.println("Kampioenen volgens nationaliteit:");
        for (Piloot piloot : piloten.volgensNationaliteit()) {
            System.out.printf("%-12s -> %s%n", piloot.getNationaliteit(), piloot.getNaam());
        }
        System.out.println();
    }
}