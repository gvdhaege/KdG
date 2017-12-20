package be.kdg.simpleio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SimpleIO {
    public static void main(String[] args) {
        Path testBestand = Paths.get("resources\\test.txt");
        if (!Files.exists(testBestand)) {
            try {
                Files.createFile(testBestand);
            } catch (IOException ioe) {
                System.out.println("Try again!");
            }
        }
    }
}
