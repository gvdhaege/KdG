package be.kdg.mastermind.model;

import be.kdg.mastermind.Log;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Deze klasse laad de spelregels vanuit een tekstbestand in de rootfolder van het project
 *
 * @author Willy Wonka
 */
public class Rules {
    public static final String RULES_FILE = "rules.txt";

    private String rules = "";

    public Rules() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                this.getClass().getResourceAsStream("/" + RULES_FILE)))){
            String line = "";
            while ((line=reader.readLine())!=null){
                rules += line + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
            Log.debug("Unable to load game rules: " + e.getMessage());
            throw new MastermindException("Unable to load the game rules...");
        }
    }

    public String getRules(){
        return rules;
    }
}
