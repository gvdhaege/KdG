package doom.character;

public class Player extends DoomCharacter {
    public static final int START_HEALTH = 9;
    private double health = START_HEALTH;

    public Player(int x, int y) {
        super(x, y);
    }

    public void attack(double damage) {
        health -= damage;
        if (health <= 0) {
            health = 0;
            System.out.println("I'm death");
            System.out.println("Aaarrrrgh...");
        }
    }

    public double getHealth() {
        return health;
    }

    public boolean isDeath() {
        return health <= 0;
    }

    @Override
    public String toString() {
        return "P";
    }
}