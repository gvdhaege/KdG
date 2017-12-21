package be.kdg.doom;


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
            monsters[i] = new Monster(
                    player,
                    1 + r.nextInt(Room.WIDTH - 2),
                    1 + r.nextInt(Room.HEIGHT - 2));
        }
        room = new Room(player, monsters);
    }

    public boolean isFinished(){
        return room.isFinished();
    }

    //de gameloop
    public void start() {
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
    }

    private void showHUD() {
        System.out.printf("Health:%3.0f\n",room.getPlayer().getHealth());
    }
}
