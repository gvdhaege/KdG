package be.kdg.doom;


import be.kdg.doom.monsters.Follower;
import be.kdg.doom.monsters.Monster;
import be.kdg.doom.monsters.TimeBomb;
import be.kdg.doom.monsters.Zombie;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;

/**
 * Created by vochtenh on 20/11/2016.
 */
public class Doom {
    public static final int NUMBER_OF_MONSTERS = 20;
    private Room room;

    public Doom() {
        Player player = new Player(Room.WIDTH /2, Room.HEIGHT /2);
        Monster[] monsters = new Monster[NUMBER_OF_MONSTERS];
        Random r = new Random();
        for (int i=0;i<NUMBER_OF_MONSTERS;i++){
            int keuze = r.nextInt(4);
            if (keuze==0) {
                monsters[i] = new Monster(player, 1 + r.nextInt(Room.WIDTH - 2), 1 + r.nextInt(Room.HEIGHT - 2));
            } else if (keuze==1){
                monsters[i] = new Zombie(player, 1 + r.nextInt(Room.WIDTH - 2), 1 + r.nextInt(Room.HEIGHT - 2));
            } else if (keuze==2){
                monsters[i] = new TimeBomb(player, 1 + r.nextInt(Room.WIDTH - 2), 1 + r.nextInt(Room.HEIGHT - 2));
            } else {
                monsters[i] = new Follower(player,1 + r.nextInt(Room.WIDTH - 2), 1 + r.nextInt(Room.HEIGHT - 2 ));
            }
        }
        room = new Room(player, monsters);
    }

    public boolean isFinished(){
        return room.isFinished();
    }

    //de gameloop
    public void start() {
        Instant start = Instant.now();
        while (!isFinished()){
            room.update();
            room.draw();
            showHUD();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Instant end = Instant.now();
        System.out.print("The player survived for ");
        System.out.print(ChronoUnit.SECONDS.between(start,end));
        System.out.println(" seconds...");
    }

    private void showHUD() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.print(localDate.format(DateTimeFormatter.ofPattern("dd MMM yyyy")));
        for (int i = 0; i< Room.WIDTH - 17; i++) System.out.print(" ");
        System.out.print(localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        for (int i = 0; i< Room.WIDTH - 17; i++) System.out.print(" ");
            System.out.printf("Health:%3.0f\n",room.getPlayer().getHealth());
    }
}
