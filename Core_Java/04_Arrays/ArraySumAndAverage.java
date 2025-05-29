public class ArraySumAndAverage {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        double avg = (double) sum / arr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}

