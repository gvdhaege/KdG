package be.kdg.wielrennen.threading;

import be.kdg.wielrennen.model.WielRenner;

import java.util.List;
import java.util.function.Predicate;

public class WielRennerAttacker implements Runnable {
    private Predicate<WielRenner> predicate;
    private List<WielRenner> wielRennerList;

    public WielRennerAttacker(List<WielRenner> wielRenners, Predicate<WielRenner> predicate) {
        this.wielRennerList = wielRenners;
        this.predicate = predicate;
    }

    @Override
    public void run() {
        synchronized (wielRennerList) {
            wielRennerList.removeIf(predicate);
        }
    }
}
