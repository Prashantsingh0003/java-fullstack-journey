import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Prashant");
        map.put(102, "Pawan");
        map.put(103, "Ravi");

        System.out.println("HashMap: " + map);
    }
}