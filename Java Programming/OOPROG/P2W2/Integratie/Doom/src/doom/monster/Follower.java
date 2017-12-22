package doom.monster;

import doom.character.Player;

public class Follower extends SimpleMonster {

    public Follower(int x, int y, Player player) {
        super(x, y, player);
    }

    @Override
    public void move() {
        int newX = this.x < getPlayer().getX() ? this.x + 1 : this.x - 1;
        int newY = this.y < getPlayer().getY() ? this.y + 1 : this.y - 1;

        if (getRoom().isFree(newX, newY)) {
            x = newX;
            y = newY;
        }
    }

    @Override
    public String toString() {
        return "F";
    }
}


