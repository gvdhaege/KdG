package kids;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoKind {
    public static void main(String[] args) {
        Map<String, Kind> kinderen = new TreeMap<>();
        kinderen.put("Lukas", new Kind("Lukas", 18, 173));
        kinderen.put("Daisy", new Kind("Daisy", 18, 163));
        kinderen.put("Fred", new Kind("Fred", 19, 173));
        kinderen.put("Fred", new Kind("Fred", 15, 151));
        kinderen.put("Joke", new Kind("Joke", 15, 190));
        kinderen.put("Daisy", new Kind("Daisy", 16, 154));

        System.out.println(kinderen);

        for (String key : kinderen.keySet()){
            System.out.print(key + " ");
        }
        System.out.println();
        for (String key : kinderen.keySet()){
            System.out.print(kinderen.get(key) + " ");
        }
        System.out.println();
        for(Kind kind : kinderen.values()){
            System.out.println(kind);
        }
    }
}
