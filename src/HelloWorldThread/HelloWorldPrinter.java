package HelloWorldThread;

public class HelloWorldPrinter implements Runnable {
    @Override
    public void run() {
        // add whatever  code you want to run on seprate thread put here
        System.out.println("Hello World Run Via " + Thread.currentThread().getName());
    }
}
