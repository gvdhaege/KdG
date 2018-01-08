package be.kdg.toets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Kristiaan Behiels
 * @version 1.0 1/12/13
 */
public class SetEquals {
    public static void main(String[] args) {
        Set<String> s1 = new TreeSet<>(Arrays.asList("1", "2", "3"));
        Set<String> s2 = new HashSet<>(Arrays.asList("2", "1", "2", "3"));
        System.out.println(s1.equals(s2));
    }
}
