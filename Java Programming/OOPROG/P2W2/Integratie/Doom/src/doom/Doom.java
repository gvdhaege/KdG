package doom;

import doom.character.Player;
import doom.monster.*;
import doom.room.Room;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Doom {
    public static final int AMOUNT_OF_MONSTERS = 20;
    private Room room;

    public Doom() {
        Player player = new Player(Room.WIDTH / 2, Room.HEIGHT / 2);
        Monster[] monsters = new Monster[AMOUNT_OF_MONSTERS];
        Random random = new Random();
        for (int i = 0; i < AMOUNT_OF_MONSTERS; i++) {
            int typeOfMonster = random.nextInt(4);
            switch (typeOfMonster) {
                case 0:
                    monsters[i] = new SimpleMonster(1 + random.nextInt(Room.WIDTH - 2), 1 + random.nextInt(Room.HEIGHT - 2), player);
                    break;
                case 1:
                    monsters[i] = new Zombie(1 + random.nextInt(Room.WIDTH - 2), 1 + random.nextInt(Room.HEIGHT - 2), player);
                    break;
                case 2:
                    monsters[i] = new TimeBomb(1 + random.nextInt(Room.WIDTH - 2), 1 + random.nextInt(Room.HEIGHT - 2), player);
                    break;
                case 3:
                    monsters[i] = new Follower(1 + random.nextInt(Room.WIDTH - 2), 1 + random.nextInt(Room.HEIGHT - 2), player);
                    break;
                default:
                    break;
            }
        }
        this.room = new Room(player, monsters);
    }

    public boolean isFinished() {
        return room.isFinished();
    }

    public void start() {
        Instant start = Instant.now();
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
        Instant end = Instant.now();
        System.out.print("The player survived for ");
        System.out.print(ChronoUnit.SECONDS.between(start, end));
        System.out.println(" seconds...");
    }

    public void showInfo() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.print(localDate.format(DateTimeFormatter.ofPattern("dd MMM yyyy")));
        for (int j = 0; j < Room.WIDTH - 17; j++) System.out.print(" ");
        System.out.print(localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        for (int j = 0; j < Room.WIDTH - 13; j++) System.out.print(" ");
        System.out.printf("Health:%3.0f\n", room.getPlayer().getHealth());
    }
}
