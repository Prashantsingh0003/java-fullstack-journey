public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
            System.out.println("Result: " + a);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block always runs.");
        }
    }
}