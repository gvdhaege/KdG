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
        return String.format("%-14s -> %d", naam, score);
    }
}
