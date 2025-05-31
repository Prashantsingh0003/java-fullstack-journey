public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        sb.delete(5, 6);
        sb.insert(5, ",");
        sb.reverse();

        System.out.println("Final StringBuilder: " + sb);
    }
}