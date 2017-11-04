import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MusicMachine musicMachine = new MusicMachine();
        Scanner scanner = new Scanner(System.in);
        String[] instrumenten = musicMachine.INSTRUMENTEN;

        System.out.println("Kies je instrument: ");
        for (int i = 1; i <= instrumenten.length; i++) {
            System.out.printf("\t%d:%s%n", i, instrumenten[i - 1]);
        }
        System.out.print("Je keuze: ");
        int instrumentKeuze = scanner.nextInt();
        musicMachine.setInstrument(instrumentKeuze - 1);
        musicMachine.playMusic(10);
    }
}
