package be.kdg.mastermind.model;

import be.kdg.mastermind.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vochtenh on 16/02/2016.
 */
public class Mastermind {
    public static final int MAX_NUMBER_OF_GUESSES = 9;
    private List<Combination> guesses;
    private List<Hint> hints;
    private Combination riddle;
    private boolean foundIt;

    public Mastermind() {
        riddle = new Combination();
        Log.debug("Opgave:" + riddle.toString());
        guesses = new ArrayList<>();
        hints = new ArrayList<>();
        foundIt = false;
    }

    public void doGuess(Combination guess) {
        if (guesses.size() >= MAX_NUMBER_OF_GUESSES) {
            throw new MastermindException("Maximum number of guesses reached!");
        }
        if (guess.equals(riddle)) {
            foundIt = true;
        } else {
            Hint hint = new Hint();
            for (int i = 0; i < Combination.COMBINATION_SIZE; i++) {
                if (riddle.getColor(i) == guess.getColor(i)) {
                    hint.addColor(HintColor.WHITE);
                } else if (riddle.contains(guess.getColor(i))) {
                    hint.addColor(HintColor.BLACK);
                }
            }
            hints.add(hint);
        }
    }

    public boolean playerWon(){
        return foundIt;
    }

    public boolean playerLost(){
        return !foundIt&&guesses.size() >= MAX_NUMBER_OF_GUESSES;
    }

    public Combination getLatestGuess(){
        if (guesses.size()==0) return null;
        return guesses.get(guesses.size()-1);
    }

    public Hint getLatestHint(){
        if (hints.size()==0) return null;
        return hints.get(hints.size()-1);
    }
}
