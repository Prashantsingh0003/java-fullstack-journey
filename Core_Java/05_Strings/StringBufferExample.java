public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");
        sb.insert(0, "Welcome to ");
        sb.replace(11, 15, "Core Java");
        sb.reverse();

        System.out.println("Final StringBuffer: " + sb);
    }
}