package doom.character;

public class Monster extends DoomCharacter {
    public static final int STRENGTH = 1;
    private Player player;

    public Monster(int x, int y, Player player) {
        super(x, y);
        this.player = player;
    }

    public void attackPlayer() {
        if (Math.abs(getPlayer().getX() - x) <= 1
                && Math.abs(getPlayer().getY() - y) <= 1) {
            getPlayer().attack(STRENGTH);
        }
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public String toString() {
        return "M";
    }
}
