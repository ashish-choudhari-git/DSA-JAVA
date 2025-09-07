/*
  Time Complexity: O(n) 
  Space Complexity: O(n) 
 */


public class FibonacciSequence {

    static int[] generateFib(int n) {
        int[] fib = new int[n];

        if (n >= 1) {
            fib[0] = 0;
        }
        if (n >= 2) {
            fib[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] result = generateFib(n);

        System.out.print("First " + n + " Fibonacci numbers: ");
        
        for (int num : result) {
            System.out.print(num + " ");
        }

    }
}
