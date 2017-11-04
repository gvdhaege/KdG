import org.jfugue.Player;

import java.util.Random;

public class MusicMachine {
    //DE EIGENSCHAPPEN ZIJN GEGEVEN
    public final String[] INSTRUMENTEN = {"Piano",
            "Guitar", "Violin", "Trumpet", "Voice_oohs", "Tuba", "Acoustic_bass"};
    private Player player;
    private Random randomGenerator;
    private int selectedInstrument;

    //CONSTRUCTOR IS GEGEVEN
    public MusicMachine() {
        player = new Player();
        randomGenerator = new Random();
        this.selectedInstrument = 0;
    }

    public void setInstrument(int number) {
        if (number >= 0 && number <= INSTRUMENTEN.length) {
            this.selectedInstrument = number;
        }
    }

    public void playMusic(int aantalAkkoorden) {
        String muziekInstrument = INSTRUMENTEN[selectedInstrument];
        String[] akkoorden = {"min", "maj", ""};
        char[] duur = {'w', 'h', 'q', 'i'};

        for (int i = 0; i < aantalAkkoorden; i++) {
            char muzieknoot = (char) (randomGenerator.nextInt(7) + 'A');
            int akkoordIndex = randomGenerator.nextInt(3);
            int duurIndex = randomGenerator.nextInt(4);

            String muziekString = "I["
                    + muziekInstrument
                    + "] "
                    + muzieknoot
                    + akkoorden[akkoordIndex]
                    + duur[duurIndex];

            player.play(muziekString);
            System.out.println(muziekString);
        }
    }
}
