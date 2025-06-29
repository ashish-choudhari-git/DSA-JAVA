public class PrimeNumber {
    public static void main(String[] args) {
        int a = 83;
        System.out.println( a +" is " + (checkPN(a) ? "a prime number." : "not a prime number."));
    }

    static boolean checkPN(int a) {
        if (a <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= a) {
            if (a % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
