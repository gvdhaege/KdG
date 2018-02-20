package model;

import utilities.Globals;

public class Word
{
    private Globals.Direction direction;
    private int number;
    private String description;
    private String solution;

    public Word(Globals.Direction direction, int number, String description, String solution)
    {
        this.direction = direction;
        this.number = number;
        this.description = description;
        this.solution = solution;
    }

    @Override
    public String toString()
    {
        return "Word {" +
                "direction = " + direction +
                ", number = " + number +
                ", description = '" + description + '\'' +
                ", solution = '" + solution + '\'' +
                '}';
    }
}
