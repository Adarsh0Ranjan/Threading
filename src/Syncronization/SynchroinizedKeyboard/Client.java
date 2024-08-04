package Syncronization.SynchroinizedKeyboard;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        // Synchronize keyboard usage by introducing a lock.
// In Java, every object has an intrinsic lock which can be utilized
// simply by using the synchronized keyword.

        Count count = new Count();
        Adder adder = new Adder(count);
        Substractor subctractor = new Substractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subctractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.count);
    }
}
