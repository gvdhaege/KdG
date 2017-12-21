package be.kdg.doom.monsters;


import be.kdg.doom.DoomCharacter;
import be.kdg.doom.Player;

/**
 * Created by vochtenh on 20/11/2016.
 */
public abstract class Monster extends DoomCharacter {
    public static final int STRENGTH = 1;
    private Player player;

    public Monster(Player player, int x, int y) {
        super(x, y);
        this.player = player;
    }

    protected Player getPlayer() {
        return player;
    }

    @Override
    public String toString() {
        return "M";
    }

    public abstract void attackPlayer();
}
