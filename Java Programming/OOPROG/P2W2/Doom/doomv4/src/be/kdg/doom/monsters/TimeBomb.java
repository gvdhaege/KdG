package be.kdg.doom.monsters;

import be.kdg.doom.Player;

/**
 * Een TimeBomb is een Monster dat niet beweegt maar gewoon aftelt en afgaat na bepaalde tijd
 */
public class TimeBomb extends Monster {
    private static final double BOMB_STRENGTH = 2;
    private int startTime;
    private int timeLeft;

    public TimeBomb(Player player, int x, int y) {
        super(player, x, y);
        this.startTime = random.nextInt(5) + 5;
        this.timeLeft = startTime;
    }

    @Override
    public void move() {
        if (timeLeft>0) {
            timeLeft--;
        }
    }

    @Override
    public void attackPlayer() {
        if (timeLeft==0){
            if (Math.abs(getPlayer().getY()- y)<=5&&Math.abs(getPlayer().getX()- x)<=5){
                getPlayer().attack(BOMB_STRENGTH);
            }
            timeLeft = startTime;
        }
    }

    @Override
    public String toString() {
        if (timeLeft==0) return "X";
        return "" + timeLeft;
    }
}
