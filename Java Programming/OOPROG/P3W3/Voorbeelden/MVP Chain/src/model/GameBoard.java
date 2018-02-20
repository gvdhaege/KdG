package model;

/*

De model class GameBoard is een representatie van het spelbord.

Voor dit eenvoudige spel zijn er 3 cellen voorzien, zie class Cell.

In deze model class werk je enkel met data :

    Je leest (eventueel) speldata in van disk.
    Je initialiseert een datastructuur obv die speldata : hier gewoon 3 cellen.
    Die datastructuur wordt GEUPDATE na elke zet van een speler : hier gebeurt dat in de class Cell.

*/

public class GameBoard
{
    private Cell cell_1;
    private Cell cell_2;
    private Cell cell_3;

    public GameBoard()
    {
        cell_1 = new Cell(10);
        cell_2 = new Cell(20);
        cell_3 = new Cell(30);
    }

    public Cell getCell_1() { return cell_1; }
    public Cell getCell_2() { return cell_2; }
    public Cell getCell_3() { return cell_3; }
}
