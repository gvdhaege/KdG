package DemoBerghutten;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Deze klasse demonstreert het lezen en schrijven van/naar tekst- en binaire bestanden.
 * De exception handling gebeurt in deze klasse.
 * Er wordt gebruik gemaakt van JFileChooser als dialoogvenster.
 */
public class DemoBerghutten
{
    // Handige constante om de JFileChooser in de juiste map te openen.
    private static String DEFAULTPAD = "c:/temp/";

    // Constructor.
    public DemoBerghutten()
    {
        String filePath = getSourceFilePath();

        List<Berghut> list = readSourceFile(filePath);
        showRecords(list, filePath);
        readNewData(list);

        filePath = getTargetFilePath();
        writeTargetFile(list, filePath);
    }

    // Gebruikt JFileChooser om het pad naar de source file op te vragen.
    private String getSourceFilePath()
    {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        File defaultPad = new File(DEFAULTPAD);
        fileChooser.setCurrentDirectory(defaultPad);
        fileChooser.setDialogTitle("Selecteer het bronbestand");
        fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();

        if ((file == null) || (file.getName().equals("")))
        {
            System.out.println("Foutieve keuze van bronbestand");
            System.exit(1);
        }

        return file.getAbsolutePath();
    }

    // Roept de juiste method van FileHandler aan op basis van de file extensie.
    private List<Berghut> readSourceFile(String file)
    {
        try
        {
            if (file.endsWith(".txt"))
            {
                return FileHandler.txtFile2List(file);
            }
            else if (file.endsWith(".bin"))
            {
                return FileHandler.binFile2List(file);
            }
            else
            {
                System.out.println("Foutieve keuze van bronbestand");
                System.exit(1);
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }

    // Logging naar console.
    private void showRecords(List<Berghut> list, String file)
    {
        String titel = "Alle records uit " + file + " :";
        System.out.println(titel);
        for (int i = 0; i < titel.length(); i++)
        {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++)
        {
            System.out.printf("%2d) %s\n", i + 1, list.get(i));
        }
    }

    // Gebruikt Scanner om nieuwe data in te lezen en aan de list toe te voegen.
    // Die list wordt meegegeven als parameter.
    private void readNewData(List<Berghut> list)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nTik de naam van de nieuwe berghut: ");
        String naam = scanner.nextLine();
        System.out.print("Hoogte: ");
        int hoogte = scanner.nextInt();
        scanner.nextLine(); //flush keyboardbuffer
        System.out.print("Locatie: ");
        String locatie = scanner.nextLine();

        list.add(new Berghut(naam, hoogte, locatie));
        System.out.println("Nieuw record toegevoegd.");
    }

    // Gebruikt JFileChooser om het pad naar de target file op te vragen.
    private String getTargetFilePath()
    {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        File defaultPad = new File(DEFAULTPAD);
        fileChooser.setCurrentDirectory(defaultPad);
        fileChooser.setDialogTitle("Kies het doelbestand");
        fileChooser.showSaveDialog(null);
        File file = fileChooser.getSelectedFile();

        if ((file == null) || (file.getName().equals("")))
        {
            System.out.println("Foutieve keuze van bronbestand");
            System.exit(1);
        }

        return file.getAbsolutePath();
    }

    // Roept de juiste method van FileHandler aan op basis van de file extensie.
    private void writeTargetFile(List<Berghut> list, String file)
    {
        try
        {
            if (file.endsWith(".txt"))
            {
                FileHandler.list2TxtFile(list, file);
                System.out.println("De data werden als tekstbestand weggeschreven");
            }
            else if (file.endsWith(".bin"))
            {
                FileHandler.list2BinFile(list, file);
                System.out.println("De data werden als binair bestand weggeschreven");
            }
            else
            {
                System.out.println("Foutieve extensie van doelbestand, moet zijn: .txt of .bin");
                System.exit(1);
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
