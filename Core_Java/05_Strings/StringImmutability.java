public class StringImmutability {
    public static void main(String[] args) {
        String original = "Hello";
        String modified = original.concat(" World");

        System.out.println("Original: " + original);
        System.out.println("Modified: " + modified);
    }
}