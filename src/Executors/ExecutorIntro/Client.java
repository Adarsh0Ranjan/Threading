package Executors.ExecutorIntro;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Executor executors = Executors.newFixedThreadPool(10);

        for(int i = 1; i<= 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            // we don't need to start thread and neither need to create thread executors it will create thread and reuse efficiently as well
            executors.execute(numberPrinter);
        }
    }
}
