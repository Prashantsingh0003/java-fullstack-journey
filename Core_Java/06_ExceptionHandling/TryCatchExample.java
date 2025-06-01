public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
            System.out.println("Result: " + a);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}