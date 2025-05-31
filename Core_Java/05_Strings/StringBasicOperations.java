public class StringBasicOperations {
    public static void main(String[] args) {
        String name = "Prashant Singh";

        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("First char: " + name.charAt(0));
        System.out.println("Substring (0-8): " + name.substring(0, 8));
        System.out.println("Contains 'Singh'? " + name.contains("Singh"));
    }
}