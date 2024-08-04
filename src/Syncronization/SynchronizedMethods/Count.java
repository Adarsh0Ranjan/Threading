package Syncronization.SynchronizedMethods;

public class Count {
    private int count = 0;

    public void  incrementValue(int i) {
        count += i;
    }

    public synchronized void  decrementValue(int i) {
        count -= 1;
    }

    public  int getValue() {
        return  count;
    }
}
