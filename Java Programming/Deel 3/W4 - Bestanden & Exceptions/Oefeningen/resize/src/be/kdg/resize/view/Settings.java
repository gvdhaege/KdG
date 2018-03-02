package be.kdg.resize.view;

import javafx.geometry.Dimension2D;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;

public class Settings {
    private static final File SETTINGS_FILE = new File("schermgrootte.txt");

    public static void saveWindowSize(Dimension2D dimension2D) {
        // Hier annvullen...
    }

    public static Dimension2D loadWindowSize() {
        // Hier annvullen...
        return null;
    }
}
