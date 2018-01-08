package be.kdg.toets;

import java.util.*;

/**
 * @author Kristiaan Behiels
 * @version 1.0 1/12/13
 */
public class SetSort {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(Arrays.asList("42", "23", "78", "12"));
        System.out.println(set);
    }
}

