package be.kdg.doom;


/**
 * Created by vochtenh on 20/11/2016.
 */
public class Doom {
    private Room room;

    public Doom() {
        Player player = new Player(Room.WIDTH /2, Room.HEIGHT /2);
        room = new Room(player);
    }

    public boolean isFinished(){
        return room.isFinished();
    }

    //de gameloop
    public void start() {
        while (!isFinished()){
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

    private void showInfo() {
        System.out.printf("Health:%3.0f\n",room.getPlayer().getHealth());
    }
}
