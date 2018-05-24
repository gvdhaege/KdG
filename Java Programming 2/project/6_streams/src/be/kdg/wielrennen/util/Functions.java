package be.kdg.wielrennen.util;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class Functions {

    public static <T> List<T> filteredList(List<T> wielrennerLijst, Predicate<T> predicate) {
        return wielrennerLijst
                .stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public static <T> Double averageCollection(Collection<T> wielrennerLijst, ToDoubleFunction<T> mapper) {
        return wielrennerLijst
                .stream()
                .mapToDouble(mapper)
                .sum() / wielrennerLijst.size();
    }

    public static <T> long countIf(Collection<T> wielrennerLijst, Predicate<T> predicate) {
        return wielrennerLijst
                .stream()
                .filter(predicate)
                .count();
    }
}
