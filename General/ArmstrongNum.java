/* An Armstrong number (or narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
*/

public class ArmstrongNum {
    // public static void main(String[] args) {
    //     int n = 153;
    //     System.out.println(n + " is " + (isArmstrong(n) ? "an Armstrong number." : "not an Armstrong number."));
    // }
    
    //Q:Find all armstrong number from 1 to 1000
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();

        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, digits);
            n /= 10;
        }

        return sum == original;
    }
}   