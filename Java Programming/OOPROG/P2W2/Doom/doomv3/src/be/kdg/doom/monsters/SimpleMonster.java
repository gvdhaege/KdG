package be.kdg.doom.monsters;

import be.kdg.doom.Player;

public class SimpleMonster extends Monster {
    public SimpleMonster(Player player, int x, int y) {
        super(player, x, y);
    }

    public void attackPlayer() {
        if (Math.abs(getPlayer().getY()- y)<=1&&Math.abs(getPlayer().getX()- x)<=1){
            getPlayer().attack(STRENGTH);
        }
    }
}
