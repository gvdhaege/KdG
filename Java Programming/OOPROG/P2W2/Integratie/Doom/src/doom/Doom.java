package doom;

import doom.character.Monster;
import doom.character.Player;
import doom.room.Room;

import java.util.Random;

public class Doom {
    public static final int AMOUNT_OF_MONSTERS = 20;
    private Room room;

    public Doom() {
        Player player = new Player(Room.WIDTH / 2, Room.HEIGHT / 2);
        Monster[] monsters = new Monster[AMOUNT_OF_MONSTERS];
        Random random = new Random();
        for (int i = 0; i < AMOUNT_OF_MONSTERS; i++) {
            monsters[i] = new Monster(
                    1 + random.nextInt(Room.WIDTH - 2),
                    1 + random.nextInt(Room.HEIGHT - 2),
                    player);
        }
        this.room = new Room(player, monsters);
    }

    public boolean isFinished() {
        return room.isFinished();
    }

    public void start() {
        while (!isFinished()) {
            room.update();
            room.draw();
            showInfo();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void showInfo() {
        System.out.printf("Health:%3.0f\n", room.getPlayer().getHealth());
    }
}
