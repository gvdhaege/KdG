package doom.monster;

import doom.character.Player;

public class TimeBomb extends Monster {
    public static final double BOMB_STRENGTH = 2;
    public int startTime;
    public int timeLeft;

    public TimeBomb(int x, int y, Player player) {
        super(x, y, player);
        this.startTime = (random.nextInt(5) + 5);
        this.timeLeft = startTime;
    }

    @Override
    public void move() {
        if (timeLeft > 0) {
            timeLeft--;
        }
    }

    @Override
    public void attackPlayer() {
        if (timeLeft == 0) {
            if (Math.abs(getPlayer().getX() - x) <= 5
                    && Math.abs(getPlayer().getY() - y) <= 5) {
                getPlayer().attack(BOMB_STRENGTH);
            }
            timeLeft = startTime;
        }
    }

    @Override
    public String toString() {
        if (timeLeft == 0) {
            return "X";
        }
        return timeLeft + "";
    }
}
