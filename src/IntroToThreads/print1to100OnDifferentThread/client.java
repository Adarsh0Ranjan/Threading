package IntroToThreads.print1to100OnDifferentThread;

public class client {
    public static void main(String[] args) {

        for(int i = 1; i<= 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread t = new Thread(numberPrinter);
            t.start();
        }
    }
}
