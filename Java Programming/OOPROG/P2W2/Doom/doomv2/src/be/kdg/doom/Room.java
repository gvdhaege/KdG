package be.kdg.doom;

/**
 * Created by vochtenh on 20/11/2016.
 */
public class Room {
    public static final int WIDTH = 50;
    public static final int HEIGHT = 20;
    private Player player;
    private Monster[] monsters;
    private char[][] floorPlan = new char[WIDTH][HEIGHT];

    public Room(Player player, Monster[] monsters) {
        this.player = player;
        this.player.setRoom(this);
        this.monsters = monsters;
        for (Monster monster: monsters){
            monster.setRoom(this);
        }
        createFloorplan();
    }

    private void createFloorplan() {
        for (int i = 0; i<Room.WIDTH; i++) {
            for (int j = 0; j<Room.HEIGHT; j++){
                floorPlan[i][j] = ' ';
            }
        }
        for (int i = 0; i<Room.WIDTH; i++) {
            floorPlan[i][0] = '-';
            floorPlan[i][HEIGHT - 1] = '-';
        }
        for (int i = 0; i<Room.HEIGHT; i++) {
            floorPlan[0][i] = '|';
            floorPlan[WIDTH - 1][i] = '|';
        }
    }

    public void draw(){
        System.out.println();
        for (int j = 0; j<Room.HEIGHT; j++){
            for (int i = 0; i<Room.WIDTH; i++) {
                System.out.print(floorPlan[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }



    public boolean isFinished() {
        return player.isDeath();
    }

    public boolean isFree(int x, int y){
        return floorPlan[x][y]==' ';
    }

    public void update() {
        floorPlan[player.getX()][player.getY()] = ' ';
        player.move();
        floorPlan[player.getX()][player.getY()] = player.toString().charAt(0);
        for (Monster monster: monsters){
            floorPlan[monster.getX()][monster.getY()] = ' ';
            monster.move();
            floorPlan[monster.getX()][monster.getY()] = monster.toString().charAt(0);
            monster.attackPlayer();
        }
    }

    public Player getPlayer() {
        return player;
    }
}
