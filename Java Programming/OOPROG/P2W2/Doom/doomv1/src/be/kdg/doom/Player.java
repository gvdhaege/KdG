package be.kdg.doom;

import java.util.Random;

public class Player {
    public static final double START_HEALTH = 9;
    private double health = START_HEALTH;
    private int x;
    private int y;
    private Random random;
    private Room room;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        this.random = new Random();
    }


    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setRoom(Room room) {
        this.room = room;
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

    public void move() {
        int newx = x + (random.nextInt(3) - 1);
        int newy = y + (random.nextInt(3) - 1);
        if (room.isFree(newx,newy)){
            x = newx;
            y = newy;
        }
    }

    @Override
    public String toString() {
        return "P";
    }
}
