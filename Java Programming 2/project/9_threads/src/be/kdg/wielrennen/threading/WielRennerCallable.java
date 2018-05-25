package be.kdg.wielrennen.threading;

import be.kdg.wielrennen.model.WielRenner;
import be.kdg.wielrennen.model.WielRennerFactory;

import java.util.concurrent.Callable;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WielRennerCallable implements Callable {
    private Predicate<WielRenner> predicate;

    public WielRennerCallable(Predicate<WielRenner> predicate) {
        this.predicate = predicate;
    }

    @Override
    public Object call() throws Exception {
        return Stream
                .generate(WielRennerFactory::newRandomWielRenner)
                .filter(predicate)
                .limit(1000)
                .collect(Collectors.toList());
    }
}
