package HelloWorldThread;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
//        helloWorldPrinter.run(); // if we run like this it will still run  on same thread

        // Apart form below code everything is running on main thread
        Thread thread = new Thread(helloWorldPrinter);
//        thread.setName("Hello World Thread"); // this is optional
        thread.start(); // no this runs


    }
}
