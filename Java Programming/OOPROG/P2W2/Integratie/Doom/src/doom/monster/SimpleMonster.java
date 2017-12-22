package doom.monster;

import doom.character.Player;

public class SimpleMonster extends Monster {

    public SimpleMonster(int x, int y, Player player) {
        super(x, y, player);
    }

    @Override
    public void attackPlayer() {
        if (Math.abs(getPlayer().getX() - x) <= 1
                && Math.abs(getPlayer().getY() - y) <= 1) {
            getPlayer().attack(STRENGTH);
        }
    }
}