package be.kdg.scores2;

/**
 * @author Kristiaan Behiels
 * @version 1.0 1/12/13
 */
public class Student {
    private String naam;
    private int score;

    public Student(String naam, int score) {
        this.naam = naam;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("%-12s -> %2d", naam, score);
    }
}
