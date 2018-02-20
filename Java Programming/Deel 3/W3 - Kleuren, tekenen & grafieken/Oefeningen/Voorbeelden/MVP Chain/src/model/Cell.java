package model;

/*

De model class Cell bevat informatie over elke cel van het speelbord.
    3 kleuren die de background van de cel bepalen, afhankelijk van de spellogica.
    Een limiet waarde per cel.
    Een boolean die bijhoudt of de cel al gebruikt is door de speler.

*/

public class Cell
{
    private String colorCorrect;
    private String colorTooLow;
    private String colorTooHigh;

    private int limit = 0;
    private boolean answered;

    // In de cosntructor worden de privates geïnitialiseerd.
    public Cell(int limit)
    {
        colorCorrect = "-fx-background-color: green;";
        colorTooLow = "-fx-background-color: red;";
        colorTooHigh = "-fx-background-color: cyan;";

        this.limit = limit;
        answered = false;
    }

    public String getColorCorrect()             { return colorCorrect; }
    public String getColorTooLow()              { return colorTooLow;  }
    public String getColorTooHigh()             { return colorTooHigh; }

    public int getLimit()                       { return limit;}
    public void setAnswered(boolean answered)
    {
        this.answered = answered;
        System.out.println("Just set answered of cel with limit " + limit + " to true.");
    }
}
