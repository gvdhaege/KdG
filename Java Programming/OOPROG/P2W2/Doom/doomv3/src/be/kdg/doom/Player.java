package be.kdg.doom;

/**
 * Created by vochtenh on 20/11/2016.
 */
public class Player extends DoomCharacter {
    public static final double START_HEALTH = 9;
    private double health = START_HEALTH;

    public Player(int x, int y) {
        super(x, y);
    }

    public void attack(double damage){
        health -= damage;
        if (health<=0) {
            health = 0;
            System.out.println("I'm death!");
            System.out.println("Aaarrgh....");
        }
    }

    public double getHealth() {
        return health;
    }

    public boolean isDeath(){
        return health <= 0;
    }

    @Override
    public void move() {
        int newx = x + (random.nextInt(3) - 1);
        int newy = y + (random.nextInt(3) - 1);
        if (getRoom().isFree(newx,newy)){
            x = newx;
            y = newy;
        }
    }

    @Override
    public String toString() {
        return "P";
    }
}
