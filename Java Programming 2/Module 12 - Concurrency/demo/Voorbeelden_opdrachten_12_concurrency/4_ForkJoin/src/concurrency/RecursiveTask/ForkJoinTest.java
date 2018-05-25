package concurrency.RecursiveTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinTest {
    public static void main(String[] args) {
	    int cores = 4;
        int size = 1000;

        ForkJoinPool pool = new ForkJoinPool(cores);

        double[] numbers = new double[10_000_000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (double) i;
        }
        Accumulate task = new Accumulate(numbers, 0, numbers.length, size);

        long start = System.nanoTime();
        pool.invoke(task);
        long end = System.nanoTime();

	    try {
		    System.out.println(String.format("Som: %,d",task.get()));
	    } catch (InterruptedException | ExecutionException e) {
		    e.printStackTrace();
	    }
	    System.out.println("Level of parallelism: " + cores);
        System.out.printf("Elapsed time: %.3f ms", (end - start) / 1_000_000.0);
        System.out.println();

	    Accumulate forTask = new Accumulate(numbers, 0, numbers.length, size);
	    start = System.nanoTime();
	    forTask.sequentialCompute();
	    end = System.nanoTime();
	    System.out.printf("Elapsed time for loop: %.3f ms", (end - start) / 1_000_000.0);

    }
}



/*
Som: 49999995000000
Level of parallelism: 8
Elapsed time: 36.552 ms
Elapsed time for loop: 182.068 ms

*/

