// HashSet Demo

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10); // duplicate, will not be added

        System.out.println("HashSet: " + set);
    }
}