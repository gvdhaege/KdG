package be.kdg.toets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Kristiaan Behiels
 * @version 1.0 1/12/13
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> getallen = new HashSet<>();
        getallen.addAll(Arrays.asList(8,6,4,1));
        getallen.add(5);
        getallen.add(4);
        System.out.println(getallen);

    }

}

/*
[1, 4, 5, 6, 8]
*/