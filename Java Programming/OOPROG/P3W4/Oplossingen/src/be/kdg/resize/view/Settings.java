package be.kdg.resize.view;

import javafx.geometry.Dimension2D;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;

public class Settings {
    private static final File SETTINGS_FILE = new File("schermgrootte.txt");

    public static void saveWindowSize(Dimension2D dimension2D) {
        try (Formatter formatter = new Formatter(SETTINGS_FILE)) {
            formatter.format("%.0fx%.0f", dimension2D.getWidth(), dimension2D.getHeight());
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Dimension2D loadWindowSize() {
        try (FileReader fileReader = new FileReader(SETTINGS_FILE)) {
            final char[] buffer = new char[20];
            fileReader.read(buffer);
            String[] numbers = new String(buffer).trim().split("x");
            return new Dimension2D(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]));
        }
        catch (IOException ex) {
            return new Dimension2D(600.0, 400.0);
        }
    }
}
