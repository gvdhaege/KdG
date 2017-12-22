import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Piloten {
    private List<Piloot> piloten;

    public Piloten() {
        this.piloten = new ArrayList<>(new Data().getPiloten());
    }

    public Piloot pilootMetDeSnelsteTijd() {
        return Collections.max(piloten);
    }

    public Piloot pilootMetDeTraagsteTijd() {
        return Collections.min(piloten);
    }

    public String toonPiloten() {
        StringBuilder sb = new StringBuilder();
        for (Piloot piloot : piloten) {
            sb.append(piloot).append('\n');
        }
        return sb.toString();
    }


    public String toonGesorteerdVolgensTijd() {
        StringBuilder sb = new StringBuilder();
        Collections.sort(piloten);
        for (int i = 0; i < piloten.size(); i++) {
            sb.append(String.format("%3d %s", i + 1, piloten.get(i)));
            sb.append("\n");
        }
        return sb.toString();
    }
}

