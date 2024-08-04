package Syncronization.SynchronizedMethods;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        // Synchronize keyboard usage by introducing a lock.
        // In Java, every object has an intrinsic lock which can be utilized
        // simply by using the synchronized keyword.
        // Instead of placing synchronized at every position,
        // simply make the method synchronized.// We should not make every method synchronized because it decreases performance.
       // If you declare a method of a class as synchronized, only one synchronized method can be called at a time, and only one thread can call that method of that particular object.
       // this is the reason we avoid to use vector in java


        Count count = new Count();
        Adder adder = new Adder(count);
        Substractor subctractor = new Substractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subctractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.getValue());
    }
}
