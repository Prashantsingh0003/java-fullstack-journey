import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Apple"); // duplicate

        System.out.println("LinkedHashSet: " + lhs);
    }
}