package be.kdg.wielrennen.patterns;

import java.util.Observable;
import java.util.Observer;

public class WielRennersObserver implements Observer {
    private ObservableWielRenners observableWielRenners;

    public WielRennersObserver(ObservableWielRenners observableWielRenners) {
        this.observableWielRenners = observableWielRenners;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
    }
}
