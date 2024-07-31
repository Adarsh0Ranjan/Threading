package Executors.ExecutorIntro;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        // This will create 10 threads but if we have 11 task then 1 task will wait in work queue once thread will get available it 11 task will gets assigned
//        Executor executors = Executors.newFixedThreadPool(10);

        //This will adjust number of thread according the requirement it will create new thread if threads are busy if available the reuse
        Executor executors = Executors.newCachedThreadPool();

        // for getting more control like stop pause and all use executor service

        for(int i = 1; i<= 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            // we don't need to start thread and neither need to create thread executors it will create thread and reuse efficiently as well
            executors.execute(numberPrinter);
        }
    }
}
