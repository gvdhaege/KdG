package be.kdg.mastermind.model;

import be.kdg.mastermind.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * De klasse Mastermind is de belangrijkste modelklasse die de
 * spelintelligentie bevat.
 * Alle gokken en hints worden hier in de vorm van een ArrayList opgeslagen.
 * Ook de geheime code wordt hier gegenereerd en gecontroleerd.
 * Hier wordt ook beslist wanneer het spel gedaan is en of er gewonnen werd.
 *
 * @author Willy Wonka
 */
public class Mastermind {
    private List<Combination> guesses;
    private List<Hint> hints;
    private Combination riddle;
    private boolean foundIt;

    private Settings settings;

    /**
     * Start een nieuw mastermind spel op. Ook de settings worden terug gereset.
     * Een nieuwe opgave wordt gegenereerd.
     */
    public Mastermind() {
        settings = new Settings();
        restart();
    }

    /**
     * Herstart het spel. De settings blijven behouden. Een nieuwe opgave wordt gegenereerd.
     */
    public void restart() {
        riddle = new Combination(settings.isDuplicateColorsAllowed());
        Log.debug("Opgave:" + riddle.toString());
        guesses = new ArrayList<>();
        hints = new ArrayList<>();
        foundIt = false;
    }

    /**
     * Doe een gok. De gok wordt bijgehouden in de lijst van guesses. Er wordt gecontroleerd of
     * de gok juist is. Als hij juist is eindigt het spel.
     * Is de gok fout, dan wordt een hint gegenereerd en in de lijst van hints geplaatst.
     * @param guess
     */
    public void doGuess(Combination guess) {
        if (guess==null) throw new IllegalArgumentException("guess should not be null");
        if (guesses.size() >= settings.getNumberOfGuesses()) {
            throw new MastermindException("Maximum number of guesses reached!");
        }
        guesses.add(guess);
        if (guess.equals(riddle)) {
            foundIt = true;
        } else {
            createHint(guess);
        }
    }

    /**
     * Aanmaken van een hint op basis van de gok en het raadsel
     * @param guess
     */
    private void createHint(Combination guess) {
        Hint hint = new Hint();
        for (int i = 0; i < Combination.COMBINATION_SIZE; i++) {
            if (riddle.getColor(i) == guess.getColor(i)) {
                hint.addColor(HintColor.WHITE);
            } else if (riddle.contains(guess.getColor(i))) {
                hint.addColor(HintColor.BLACK);
            }
        }
        hints.add(hint);
        Log.debug(hint.toString());
    }

    public int getMaxNumberOfGuesses() {
        return settings.getNumberOfGuesses();
    }

    public int getCombinationSize(){
        return Combination.COMBINATION_SIZE;
    }

    /**
     * Als het maximum aantal gokken bereikt is en de oplossing niet gevonden
     * @return
     */
    public boolean playerLost(){
        return !foundIt&&guesses.size() >= settings.getNumberOfGuesses();
    }

    public int getNumberOfGuessesDone(){
        return guesses.size();
    }

    /**
     * Als de oplossing gevonden is of het maximum aantal gokken bereikt
     * @return
     */
    public boolean gameFinished() {
        return foundIt||(getNumberOfGuessesDone()==getMaxNumberOfGuesses());
    }

    public Combination getRiddle() {
        return riddle;
    }

    /**
     * Bewaar het spel naar een binair bestand om later verder te kunnen spelen
     * @throws MastermindException als het bewaren mislukte (IO probleem)
     */
    public void saveGame() throws MastermindException {
        MastermindSaver saver = new MastermindSaver(this);
        try {
            saver.save();
        } catch (IOException e) {
            Log.error(e.getMessage());//you could save to logfile
            throw new MastermindException(e);
        }
    }

    public Settings getSettings() {
        return settings;
    }

    /**
     * Laad het spel van een bestand.
     * @throws MastermindException als het bestand niet gevonden wordt.
     */
    public void loadGame() {
        MastermindSaver saver = new MastermindSaver(this);
        try {
            saver.load();
        } catch (IOException e) {
            Log.error(e.getMessage());//you could save to logfile
            throw new MastermindException(e);
        }
    }

    /**
     * @return alle tot nu toe gedane gokken
     */
    public List<Combination> getGuesses() {
        return guesses;
    }

    /**
     * @return alle hints. Volgorde komt overeen met de gokken (guesses)
     */
    public List<Hint> getHints() {
        return hints;
    }

    /**
     * Start een bestaand spel op: herstelt alle gokken, het raadsel en de settings.
     * De hints worden op basis van die info opnieuw aangemaakt. Package private: enkel aan te roepen vanuit MastermindSaver
     * @param guesses
     * @param riddle
     * @param settings
     */
    void load(List<Combination> guesses, Combination riddle, Settings settings) {
        this.guesses = guesses;
        this.riddle = riddle;
        this.foundIt = false;
        this.settings = settings;
        this.hints.clear();
        for (Combination guess: guesses) {
            createHint(guess);
        }
    }
}
