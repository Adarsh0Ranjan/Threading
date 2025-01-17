package Syncronization.SynchronizedMethods;

public class Substractor implements Runnable {
    private Count count;

    public Substractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++) {
            synchronized (count) {
                count.decrementValue(i);
            }
        }
    }
}
