package doom.monster;

import doom.character.Player;

public class Zombie extends Monster {
    public enum ZombieStatus {ALIVE, DEATH}

    private ZombieStatus zombieStatus;


    public Zombie(int x, int y, Player player) {
        super(x, y, player);
        this.zombieStatus = ZombieStatus.DEATH;
    }

    @Override
    public void move() {
        if (zombieStatus == ZombieStatus.ALIVE) {
            super.move();
            if (Math.random() < 0.7)
                zombieStatus = ZombieStatus.DEATH;
        } else {
            if (Math.random() < 0.1)
                zombieStatus = ZombieStatus.ALIVE;
        }
    }

    @Override
    public void attackPlayer() {
        if (zombieStatus == ZombieStatus.ALIVE
                && Math.abs(getPlayer().getX() - x) <= 1
                && Math.abs(getPlayer().getY() - y) <= 1)
            getPlayer().attack(STRENGTH);
    }

    @Override
    public String toString() {
        return zombieStatus == ZombieStatus.ALIVE ? "+" : "Z";
    }
}
