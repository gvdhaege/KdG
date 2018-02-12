package be.kdg.mastermind.model;

import be.kdg.mastermind.Log;

import java.util.Scanner;

/**
 * Created by vochtenh on 17/02/2016.
 */
public class TestMastermind {
    public static void main(String[] args) {
        Mastermind mastermind = new Mastermind();
        Scanner s = new Scanner(System.in);
        System.out.println("Doe gok (combinatie van RGBY):");
        String answer = s.nextLine();
        if (answer.length()>=4) {
            String guess = answer.substring(0,4);
            CombinationColor[] colors = new CombinationColor[4];
            for (int i=0;i<4;i++){
                switch (guess.charAt(i)){
                    case 'R': colors[i] = CombinationColor.RED;break;
                    case 'G': colors[i] = CombinationColor.GREEN;break;
                    case 'Y': colors[i] = CombinationColor.YELLOW;break;
                    case 'B': colors[i] = CombinationColor.BLUE;break;
                }
            }
            Combination combination = new Combination(colors);
            mastermind.doGuess(combination);
        }
        Hint hint = mastermind.getLatestHint();
        Log.debug(hint.toString());
    }
}
