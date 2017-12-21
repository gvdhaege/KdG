package be.kdg.doom.monsters;

import be.kdg.doom.Player;

public class Follower extends SimpleMonster {
    public Follower(Player player, int x, int y) {
        super(player, x, y);
    }

    @Override
    public void move() {
        int newx = this.x < getPlayer().getX()? this.x + 1: this.x - 1;
        int newy = this.y < getPlayer().getY()? this.y + 1: this.y - 1;
        if (getRoom().isFree(newx,newy)) {
            this.x = newx;
            this.y = newy;
        }
    }

    @Override
    public String toString() {
        return "F";
    }
}
