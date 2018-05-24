package be.kdg.wielrennen.threading;

import be.kdg.wielrennen.model.WielRenner;
import be.kdg.wielrennen.model.WielRennerFactory;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WielRennerRunnable implements Runnable {
    private Predicate<WielRenner> predicate;
    private List<WielRenner> wielRenners;

    public WielRennerRunnable(Predicate<WielRenner> predicate) {
        this.predicate = predicate;
    }

    @Override
    public void run() {
        wielRenners = Stream.generate(WielRennerFactory::newRandomWielRenner)
                .filter(predicate)
                .limit(1000)
                .collect(Collectors.toList());
    }

    public List<WielRenner> getWielRenners() {
        return wielRenners;
    }
}
