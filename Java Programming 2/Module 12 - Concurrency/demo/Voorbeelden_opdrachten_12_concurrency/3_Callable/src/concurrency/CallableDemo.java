package concurrency;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    private static final String[] words = {
            "een", "twee", "drie",
            "vier", "vijf", "zes",
            "zeven", "acht", "negen"
    };

    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<Integer>> set = new HashSet<>();
        for (String word : words) {
            Callable<Integer> callable = new WordLengthCallable(word);
            Future<Integer> future = pool.submit(callable);
            set.add(future);
        }
        int sum = 0;for (Future<Integer> future : set) {
            sum += future.get();
        }
        pool.shutdown();

        System.out.printf("The sum of lengths is %s%n", sum);

    }
}

/*
The sum of lengths is 36
*/

