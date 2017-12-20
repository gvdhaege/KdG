package be.kdg.simpleio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadingIO {
    public static void main(String[] args) {
        Path myFile = Paths.get("resources\\test.txt");
        if (Files.exists(myFile)) {
            Scanner fileScanner = null;
            try {
                fileScanner = new Scanner(myFile);
                while (fileScanner.hasNext()) {
                    String tekst = fileScanner.nextLine();
                    System.out.println(tekst);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fileScanner != null) {
                    fileScanner.close();
                }
            }
        }
    }
}
