import model.Player;
import model.Score;
import model.Word;
import filemanagement.FileManager;
import utilities.Globals;

import java.util.ArrayList;
import java.util.Collections;

//
// Dit project focust op het MODEL binnen MVP.
//
// Het project gaat over een kruiswoordraadsel.
// In de file 'kruiswoordraadsel.png' zie je het ingevulde kruiswoordraadsel.
//
// Bestudeer eerst de architectuur. De View en de Presenter zijn er even uit gelaten.
//
//      Package 'filemanagement' bevat alle classes die te maken hebben met input en output (IO).
//      Package 'model' bevat alle classes die de data managen van het project.
//      Package 'utilities' bevat classes die je overal in nodig hebt.
//
// De class Main demonstreert:
//      Hoe je de opgave kan lezen uit een file. Je zet de gegevens om in een datastructuur
//      die je kan gebruiken om de view op te bouwen.
//
//      Hoe je de players met hun score kan wegschrijven naar file.
//
//      Hoe je de lijst van de players gesorteerd kan tonen, naar console. In je game zal je hiervoor
//      een aangepaste grafische weergave gebruiken.
//

public class Main
{
    private ArrayList<String> lines;
    private ArrayList<Word> words;

    public Main()
    {
        // Opgave lezen uit een bestand.
        lines = FileManager.readTextFile("kruiswoordraadsel.txt");
        words = new ArrayList<Word>();

        // Bekijk eerst de inhoud van de file.
        //
        // We lopen door de ArrayList en verwerken de Strings, afhankelijk van de lijnnummer.
        // Die structuur leg je zelf vast, met commentaar in je source code.
        //
        // We maken Word objecten aan die alle informatie bevatten om
        //      de View te maken
        //      de oplossingen in het model te bewaren
        int lineCounter = 0;
        for (String line : lines)
        {
            switch (lineCounter)
            {
                case 0: // Titel
                case 1: // Horizontaal
                case 2: // Structuur
                case 6: // Verticaal
                    break;
                case 3:
                case 4:
                case 5:
                    words.add(getWord(Globals.Direction.HORIZONTAL, line));
                    break;
                case 7:
                case 8:
                case 9:
                    words.add(getWord(Globals.Direction.VERTICAL, line));
                    break;
            }
            lineCounter++;
        }

        System.out.println("Opgaves");
        System.out.println("-------");
        for (Word word : words)
        {
            System.out.println(word.toString());
        }

        // Players wegschrijven met hun scores.
        Score score1 = new Score(25, 320);
        Player player1 = new Player("Pat", "Reyntjens", score1);
        Score score2 = new Score(35, 400);
        Player player2 = new Player("Bart", "Van Beeumen", score2);
        Score score3 = new Score(20, 120);
        Player player3 = new Player("Ron", "Soontjens", score3);

        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        FileManager.writeToTextFile(players, "scores.txt");

        // Gesorteerde lijst van players volgens score tonen.
        //
        // Normaal lees je eerst de players uit de text file en bewaar je ze in de ArrayList 'players'
        Collections.sort(players);
        System.out.println("\nPlayers");
        System.out.println("-------");
        for (Player player : players)
        {
            System.out.println(player.toString());
        }
    }

    private Word getWord(Globals.Direction direction, String line)
    {
        // Heel nuttige method : split().
        // De line wordt opgesplitst in een array van Strings.
        // De comma is het scheidingsteken (ook dat bepaal je zelf).
        //
        // Met die gegevens en de meegegeven direction maak je een Word object aan dat je returnt.
        String[] parts = line.split(",");
        int number = Integer.parseInt(parts[0]);
        String description = parts[1];
        String solution = parts[2];

        return new Word(direction, number, description, solution);
    }

    public static void main(String[] args)
    {
        new Main();
    }
}
