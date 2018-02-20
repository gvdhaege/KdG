package model;

public class Score
{
    private int value;
    private int timeInSeconds;

    public Score(int value, int timeInSeconds)
    {
        this.value = value;
        this.timeInSeconds = timeInSeconds;
    }

    public int getValue()                           { return value; }
    public void setValue(int value)                 { this.value = value; }
    public int getTimeInSeconds()                   { return timeInSeconds; }
    public void setTimeInSeconds(int timeInSeconds) { this.timeInSeconds = timeInSeconds; }
}
