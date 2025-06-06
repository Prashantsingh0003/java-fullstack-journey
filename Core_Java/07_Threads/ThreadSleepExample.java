public class ThreadSleepExample {
    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Count: " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}