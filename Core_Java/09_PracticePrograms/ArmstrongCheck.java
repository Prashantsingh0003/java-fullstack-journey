public class ArmstrongCheck {
    public static void main(String[] args) {
        int num = 153, original = num, result = 0;

        while (num != 0) {
            int digit = num % 10;
            result += digit * digit * digit;
            num /= 10;
        }

        if (original == result) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is not an Armstrong Number");
        }
    }
}
