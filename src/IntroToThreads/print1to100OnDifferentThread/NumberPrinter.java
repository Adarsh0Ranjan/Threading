package print1to100OnDifferentThread;

public class NumberPrinter implements Runnable{
    private int num;

    public  NumberPrinter(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Printing: " + num + "from Thread " + Thread.currentThread().getName());
    }
}
