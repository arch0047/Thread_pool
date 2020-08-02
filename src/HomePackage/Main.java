package HomePackage;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        /* Interface ExecutorService extend Executor class. inducing the static method
        'newFixedThreadPool()' of the class Executors to create thread pool which will
         reuses the threads to execute the tasks */

        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 4; i++) { // call the (Processor(i).run) 4 tasks with 3 threads

            executor.submit(new Processor(i)); // assigning the new task to the processor
        }

        //shutdown & shutdownNow method stop ExecutorService
        executor.shutdown(); // wait all the thread to finish work and then close

        System.out.println("All tasks submitted.");
        try {
            executor.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException ignored) {
        }
        System.out.println("All tasks completed.");
    }
}

