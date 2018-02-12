package be.steven.mastermind.model;


import be.steven.mastermind.Log;

import java.util.ArrayList;
import java.util.List;


public class Mastermind {
    public static final int MAX_NUMBER_OF_GUESSES = 9;
    private List<Combination> guesses;
    private List<Hint> hints;
    private Combination riddle;
    private boolean solved;

    public Mastermind() {
        guesses = new ArrayList<>();
        hints = new ArrayList<>();
        riddle = new Combination();
        solved = false;

        Log.debug("opgave:" + riddle.toString());
    }

    public void doGuess(Combination guess) {
        if (guesses.size() >= MAX_NUMBER_OF_GUESSES) {
            throw new MastermindException("Maximum numnber guesses reached!");
        }
        if (guess.equals(riddle)) {
            solved = true;
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

    public boolean playerWon() {
        return solved;
    }

    public boolean playerLost() {
        return !solved && guesses.size() >= MAX_NUMBER_OF_GUESSES;
    }

    public Combination getLatestGuess() {
        if (guesses.size() == 0) return null;
        return guesses.get(guesses.size() - 1);
    }

    public Hint getLatestHint() {
        if (hints.size() == 0) return null;
        return hints.get(hints.size() - 1);
    }
}
