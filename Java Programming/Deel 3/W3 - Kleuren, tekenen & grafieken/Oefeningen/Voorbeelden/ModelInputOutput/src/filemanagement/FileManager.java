package filemanagement;

import model.Player;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

//
// FileManager is een class die enkel static methods bevat.
// Dit is een typisch voorbeeld van het gebruik van static. Je hebt geen object nodig
// voor het uitvoeren van deze methods.
//

public class FileManager
{
    //
    // Openen van een text file en lijn per lijn lezen.
    //
    // Elke lijn wordt in een ArrayList van Strings bewaard en die list wordt gereturned.
    //
    // In de Main class wordt die lijst dan verwerkt. Voorbeeld van 'division of labour' OO principe.
    //
    public static ArrayList<String> readTextFile(String file)
    {
        ArrayList<String> resultList = new ArrayList<String>();
        String line = "";

        // Een BufferedReader is efficienter dan een FileReader.
        // Denk aan YouTube : daar wordt al vooruit gelezen.
        // Cascade : de filename wordt meegegeven aan de FileReader, en die wordt meegegeven aan de BufferedReader.
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file)))
        {
            // Zo lang er gelezen kan worden, lees je een line.
            while ((line = bufferedReader.readLine()) != null)
            {
                resultList.add(line);
            }
            return resultList;
        }
        // Error handling.
        catch (IOException iOE)
        {
            System.out.println("Het bronbestand " + file + " kan niet geopend worden" + iOE.getMessage());
        }

        return null;
    }

    //
    // Openen van een text file en er Strings in bewaren.
    //
    public static void writeToTextFile(ArrayList<Player> players, String file)
    {
        // PrintWriter wordt gebruikt omdat daar veel handige methods inzitten, zoals printf();
        //
        // Ook hier cascade.
        try (PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file))))
        {
            for (Player player : players)
            {
                printWriter.printf("%s#%s#%d#%d%n",
                    player.getFirstName(),
                    player.getLastName(),
                    player.getScore().getValue(),
                    player.getScore().getTimeInSeconds());
            }
        }
        catch (IOException iOE)
        {
            System.out.println("Problemen bij het wegschrijven naar het doelbestand " + iOE.getMessage());
        }
    }
}
