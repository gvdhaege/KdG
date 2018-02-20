package exceptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

// Als voorbereiding op periode 3 : inlezen van game data, wegschrijven van scores.

public class IOExceptionDemo
{
    private Path pathToFileWrong;
    private Path pathToFileCorrect;
    private Scanner fileScanner;

    public IOExceptionDemo()
    {
        pathToFileWrong = Paths.get("files" + File.separator + "gamedat.txt");
        pathToFileCorrect = Paths.get("files" + File.separator + "gamedata.txt");
    }

    public void showLines()
    {
        // Static method om te testen of de file bestaat : exists.
        // Zet eerst de if clause in commentaar en run -> je springt naar de catch.
        // Zet dan de if clause uit commentaar en run -> geen probleem, maar je ziet niets, want de file bestaat niet.

        if (Files.exists(pathToFileWrong))
        {
            try
            {
                fileScanner = new Scanner(pathToFileWrong);

                while (fileScanner.hasNext())
                {
                    String line = fileScanner.nextLine();
                    System.out.println(line);
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            finally
            {
                if (fileScanner != null)
                {
                    fileScanner.close();
                }
            }
        }
    }

    private ArrayList<String> hints;
    private ArrayList<String> solutions;

    public void processLines()
    {
        hints = new ArrayList<String>();
        solutions = new ArrayList<String>();

        if (Files.exists(pathToFileCorrect))
        {
            try
            {
                fileScanner = new Scanner(pathToFileCorrect);

                while (fileScanner.hasNext())
                {
                    String line = fileScanner.nextLine();
                    String[] item = line.split("\t");

                    hints.add(item[0]);
                    solutions.add(item[1]);
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            finally
            {
                if (fileScanner != null)
                {
                    fileScanner.close();
                }
            }
        }
    }

    // Utility methods
    public void printHints()
    {
       for (String hint : hints)
       {
           System.out.println(hint);
       }
    }

    public void printSolutions()
    {
        for (String solution : solutions)
        {
            System.out.println(solution);
        }
    }
}
