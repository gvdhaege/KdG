package be.kdg.doom;


/**
 * Created by vochtenh on 20/11/2016.
 */
public class Monster extends DoomCharacter {
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

    public void attackPlayer() {
        if (Math.abs(getPlayer().getY()- y)<=1&&Math.abs(getPlayer().getX()- x)<=1){
            getPlayer().attack(STRENGTH);
        }
    }
}
