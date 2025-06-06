public class ThreadJoinExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread-1: " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread-2: " + i);
            }
        });

        t1.start();
        try {
            t1.join(); // wait for t1 to finish
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        t2.start();
    }
}