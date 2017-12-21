package doom.character;

import doom.room.Room;

import java.util.Random;

public abstract class DoomCharacter {
    protected int x;
    protected int y;
    private Random random;
    private Room room;

    public DoomCharacter(int x, int y) {
        this.x = x;
        this.y = y;
        this.random = new Random();
    }

    public void move() {
        int newX = x + (random.nextInt(3) - 1);
        int newY = y + (random.nextInt(3) - 1);
        if (room.isFree(newX, newY)) {
            x = newX;
            y = newY;
        }
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
}