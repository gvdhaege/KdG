package model;

public class Player implements Comparable<Player>
{
    private String firstName = "";
    private String lastName = "";
    private Score score;

    public Player(String firstName, String lastName, Score score)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public String getFirstName()                { return firstName; }
    public void setFirstName(String firstName)  { this.firstName = firstName; }
    public String getLastName()                 { return lastName; }
    public void setLastName(String lastName)    { this.lastName = lastName; }
    public Score getScore()                     { return score; }
    public void setScore(Score score)           { this.score = score; }

    @Override
    public int compareTo(Player object)
    {
        return Integer.compare(score.getValue(), object.getScore().getValue());
    }

    @Override
    public String toString()
    {
        return "Player {" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", score-value = " + score.getValue() +
                ", score-time = " + score.getTimeInSeconds() +
                '}';
    }
}
