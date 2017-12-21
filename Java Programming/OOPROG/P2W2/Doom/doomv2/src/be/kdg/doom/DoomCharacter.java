package be.kdg.doom;

import java.util.Random;

/**
 * Created by vochtenh on 20/11/2016.
 */
public class DoomCharacter {
    protected int x;
    protected int y;
    protected Random random;
    private Room room;

    public DoomCharacter(int x, int y) {
        this.x = x;
        this.y = y;
        this.random = new Random();
    }

    protected void move(){
        int newx = x + (random.nextInt(3) - 1);
        int newy = y + (random.nextInt(3) - 1);
        if (room.isFree(newx,newy)){
            x = newx;
            y = newy;
        }
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

}
