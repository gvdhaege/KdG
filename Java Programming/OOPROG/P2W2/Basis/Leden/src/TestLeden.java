import leden.Leden;
import leden.Lid;

import static leden.Soort.*;

public class TestLeden {
    public static void main(String[] args) {
        Leden leden = new Leden();
        leden.voegLidToe(new Lid("Jos", GEWOON));
        leden.voegLidToe(new Lid("Bart", ERELID));
        leden.voegLidToe(new Lid("Helmut", STEUNEND));
        leden.voegLidToe(new Lid("Marie", GEWOON));
        leden.voegLidToe(new Lid("Emma", GEWOON));
        leden.voegLidToe(new Lid("Hagar", ERELID));

        System.out.println("Aantal actieve leden: " + leden.size());
        for (int i = 0; i < leden.size() ; i++) {
            if (leden.getLid(i).getLidnummer() != 0){
                System.out.println(leden.getLid(i));
            }
        }
    }
}
