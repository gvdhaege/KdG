package DemoBerghutten;

import java.io.*;
import java.util.*;

/*
    Deze class bevat 4 static methods om een tekst/binair bestand in te lezen naar een ArrayList,
    en omgekeerd om een ArrayList weg te schrijven naar een binair/tekst bestand.

    Elke method throws an IOException.
 */

public class FileHandler
{
    public static List<Berghut> txtFile2List(String file) throws IOException
    {
        List<Berghut> resultList = new ArrayList<>();
        String line = "";

        // Een BufferedReader is efficienter dan een FileReader.
        // Denk aan YouTube : daar wordt al vooruit gelezen.
        // Cascade : de filename wordt meegegeven aan de FileReader, en die wordt meegegeven aan de BufferedReader.
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file)))
        {
            // Zo lang er gelezen kan worden, lees je een line.
            while ((line = bufferedReader.readLine()) != null)
            {
                // Parse de line en splits ze op in 3 velden.
                // Tokenizer splitst een string op een Token (character).
                StringTokenizer tokenizer = new StringTokenizer(line, "#");
                String name = tokenizer.nextToken();
                int height = Integer.parseInt(tokenizer.nextToken());
                String location = tokenizer.nextToken();

                // Maak een nieuw Berghut object aan met de ingelezen waarden, en voeg toe aan de resultList.
                Berghut berghut = new Berghut(name, height, location);
                resultList.add(berghut);
            }
            Collections.sort(resultList);
            return resultList;
        }
        // Goede error handling.
        // Eerst de read error, dan de file error.
        catch (NoSuchElementException | NumberFormatException e1)
        {
            throw new IOException("Leesfout in regel: " + line, e1);
        }
        catch (IOException e2)
        {
            throw new IOException("Het bronbestand " + file + " kan niet geopend worden", e2);
        }
    }

    public static List<Berghut> binFile2List(String file) throws IOException
    {
        List<Berghut> resultList = new ArrayList<>();

        // The Java.io.DataInputStream class lets an application read primitive Java data types from an
        // underlying input stream in a machine-independent way.
        // DataInputStream wordt gebruikt voor het inlezen van bytes en ze om te zetten naar een datatype.
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file))))
        {
            try
            {
                while (dataInputStream.available() > 0)
                {
                    String naam = dataInputStream.readUTF();    // Read string
                    int hoogte = dataInputStream.readInt();
                    String locatie = dataInputStream.readUTF();

                    Berghut berghut = new Berghut(naam, hoogte, locatie);
                    resultList.add(berghut);
                }
            }
            catch (IOException e1)
            {
                throw new IOException("Fout bij het lezen van het bronbestand " + file, e1);
            }
            Collections.sort(resultList);
            return resultList;
        }
        catch (IOException e2)
        {
            throw new IOException("Het bronbestand " + file + " kan niet geopend worden", e2);
        }
    }

    public static void list2TxtFile(List<Berghut> list, String file) throws IOException
    {
        // PrintWriter wordt gebruikt omdat daar veel handige methods inzitten, zoals printf();
        try (PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file))))
        {
            for (Berghut hut : list)
            {
                printWriter.printf("%s#%d#%s%n", hut.getNaam(), hut.getHoogte(), hut.getLocatie());
            }
        }
        catch (IOException e)
        {
            throw new IOException("Problemen bij het wegschrijven naar het doelbestand " + file, e);
        }
    }

    public static void list2BinFile(List<Berghut> list, String file) throws IOException
    {
        // A DataOutputStream lets an application write primitive Java data types to an output stream in a portable way.
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file))))
        {
            for (Berghut hut : list)
            {
                dataOutputStream.writeUTF(hut.getNaam());
                dataOutputStream.writeInt(hut.getHoogte());
                dataOutputStream.writeUTF(hut.getLocatie());
            }
        }
        catch (IOException e)
        {
            throw new IOException("Problemen bij het wegschrijven naar het doelbestand " + file, e);
        }
    }
}
