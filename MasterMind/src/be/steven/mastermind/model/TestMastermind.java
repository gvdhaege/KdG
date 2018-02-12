package be.steven.mastermind.model;

import be.steven.mastermind.Log;

import java.util.Scanner;

public class TestMastermind {
    public static void main(String[] args) {
        Mastermind mastermind = new Mastermind();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doe gok (combinatie van RGBY): ");
        String answer = scanner.nextLine();
        if (answer.length() >= 4) {
            String guess = answer.substring(0, 4);
            CombinationColor[] colors = new CombinationColor[4];
            for (int i = 0; i < 4; i++) {
                switch (guess.charAt(i)) {
                    case 'R':
                        colors[i] = CombinationColor.RED;
                        break;
                    case 'G':
                        colors[i] = CombinationColor.GREEN;
                        break;
                    case 'B':
                        colors[i] = CombinationColor.BLUE;
                        break;
                    case 'Y':
                        colors[i] = CombinationColor.YELLOW;
                        break;
                }
            }
            Combination combination = new Combination(colors);
            mastermind.doGuess(combination);
        }
        Hint hint = mastermind.getLatestHint();
        Log.debug(hint.toString());
    }
}
