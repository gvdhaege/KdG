package be.kdg.doom.monsters;

import be.kdg.doom.Player;

/**
 * Een zombie is een monster dat slechts af en toe tot leven komt
 */
public class Zombie extends Monster {
    private ZombieStatus status;
    public Zombie(Player player, int x, int y) {
        super(player, x, y);
    }

    @Override
    public void move() {
        if (status== ZombieStatus.ALIVE) {
            super.move();
            if (Math.random()<0.7) status = ZombieStatus.DEATH;
        } else {
            if (Math.random()<0.1) status = ZombieStatus.ALIVE;
        }
    }

    @Override
    public void attackPlayer() {
        if ((status==ZombieStatus.ALIVE)&&(Math.abs(getPlayer().getY()- y)<=1&&Math.abs(getPlayer().getX()- x)<=1)){
            getPlayer().attack(STRENGTH);
        }
    }

    @Override
    public String toString() {
        if (status== ZombieStatus.DEATH) return "+";
        else return "Z";
    }
}
