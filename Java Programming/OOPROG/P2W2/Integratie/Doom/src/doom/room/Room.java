package doom.room;

import doom.character.Monster;
import doom.character.Player;

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
        for (Monster monster : monsters) {
            monster.setRoom(this);
        }
        createFloorPlan();
    }

    private void createFloorPlan() {
        for (int i = 0; i < Room.WIDTH; i++) {
            for (int j = 0; j < Room.HEIGHT; j++) {
                floorPlan[i][j] = ' ';
            }
        }

        for (int i = 0; i < Room.WIDTH; i++) {
            floorPlan[i][0] = '-';
            floorPlan[i][HEIGHT - 1] = '_';
        }

        for (int i = 0; i < Room.HEIGHT; i++) {
            floorPlan[0][i] = '|';
            floorPlan[WIDTH - 1][i] = '|';
        }
    }

    public void draw() {
        System.out.println();
        for (int i = 0; i < Room.HEIGHT; i++) {
            for (int j = 0; j < Room.WIDTH; j++) {
                System.out.print(floorPlan[j][i]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public void update() {
        floorPlan[player.getX()][player.getY()] = ' ';
        player.move();
        floorPlan[player.getX()][player.getY()] = player.toString().charAt(0);
        for (Monster monster : monsters) {
            floorPlan[monster.getX()][monster.getY()] = ' ';
            monster.move();
            floorPlan[monster.getX()][monster.getY()] = monster.toString().charAt(0);
            monster.attackPlayer();
        }
    }

    public boolean isFinished() {
        return player.isDeath();
    }

    public boolean isFree(int x, int y) {
        return floorPlan[x][y] == ' ';
    }

    public Player getPlayer() {
        return player;
    }


}
