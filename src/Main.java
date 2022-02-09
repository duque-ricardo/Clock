public class Main {
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread thread = new Thread();
        thread.start();
        while (true) {
            clock.run();
            System.out.println(clock);
            thread.sleep(0);
        }
    }

}
