package be.kdg.mastermind.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Deze klasse is verantwoordelijk voor het opslagen en laden van een spel.
 * Het spel wordt opgeslagen naar een binair bestand in de rootfolder van het project
 *
 * @author Willy Wonka
 */
public class MastermindSaver {
    private static final String SAVE_GAME = "save_game.bin";
    private Mastermind model;

    public MastermindSaver(Mastermind model) {
        this.model = model;
    }

    /**
     * Bewaart de settings, de opgave en de gedane gokken naar een binair bestand
     * @throws IOException
     */
    public void save() throws IOException {
        //save game to file
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(SAVE_GAME));
        int numberOfGuesses = model.getSettings().getNumberOfGuesses();
        dos.writeInt(numberOfGuesses);
        boolean duplicateAllowed = model.getSettings().isDuplicateColorsAllowed();
        dos.writeBoolean(duplicateAllowed);
        Combination riddle = model.getRiddle();
        for (int i=0;i<Combination.COMBINATION_SIZE;i++){
            dos.writeInt(riddle.getColor(i).ordinal());
        }
        //alle guesses saven:
        dos.writeInt(model.getGuesses().size());
        for (Combination combination: model.getGuesses()) {
            for (int i=0;i<Combination.COMBINATION_SIZE;i++){
                dos.writeInt(combination.getColor(i).ordinal());
            }
        }
    }

    /**
     * Laad de settings, de opgave en de gedane gokken van een bestand
     * @throws IOException
     */
    public void load() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream(SAVE_GAME));
        int numberOfGuesses = dis.readInt();
        boolean duplicateAllowed = dis.readBoolean();
        Settings settings = new Settings();
        settings.setNumberOfGuesses(numberOfGuesses);
        settings.setDuplicateColorsAllowed(duplicateAllowed);
        CombinationColor[] colors = new CombinationColor[Combination.COMBINATION_SIZE];
        for (int i=0;i<Combination.COMBINATION_SIZE;i++){
            colors[i] = CombinationColor.values()[dis.readInt()];
        }
        Combination riddle = new Combination(colors);
        //alle guesses laden
        List<Combination> guesses = new ArrayList<>();
        int size = dis.readInt();
        for (int i=0;i<size;i++){
            CombinationColor[] guesscolors = new CombinationColor[Combination.COMBINATION_SIZE];
            for (int j=0;j<Combination.COMBINATION_SIZE;j++){
                guesscolors[j] = CombinationColor.values()[dis.readInt()];
            }
            guesses.add(new Combination(guesscolors));
        }
        model.load(guesses,riddle,settings);
    }
}
