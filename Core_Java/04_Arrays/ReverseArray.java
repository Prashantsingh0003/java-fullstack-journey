

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nReversed array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
