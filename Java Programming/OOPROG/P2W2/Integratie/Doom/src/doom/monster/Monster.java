package doom.monster;

import doom.character.DoomCharacter;
import doom.character.Player;

public abstract class Monster extends DoomCharacter {
    public static final int STRENGTH = 1;
    private Player player;

    public Monster(int x, int y, Player player) {
        super(x, y);
        this.player = player;
    }

    public abstract void attackPlayer();

    public Player getPlayer() {
        return player;
    }

    @Override
    public String toString() {
        return "M";
    }
}
