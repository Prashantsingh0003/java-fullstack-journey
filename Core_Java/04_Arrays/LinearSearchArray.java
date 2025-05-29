public class LinearSearchArray {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int key = 33;
        boolean found = false;

        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(key + " is found");
        else
            System.out.println(key + " is not found");
    }
}