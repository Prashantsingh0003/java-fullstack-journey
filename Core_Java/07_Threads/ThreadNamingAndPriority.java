public class ThreadNamingAndPriority {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
        });

        t.setName("MyCustomThread");
        t.setPriority(Thread.MAX_PRIORITY); // 10
        t.start();
    }
}