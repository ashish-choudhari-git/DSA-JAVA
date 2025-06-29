/*
  Problem: Chocolate Distribution Problem
  Description: Given an array of n integers where each value represents the number of chocolates in a packet.
                    Each packet can have a variable number of chocolates. There are m students, the task is to
                    distribute chocolate packets such that:
                    1. Each student gets one packet
                    2. The difference between the number of chocolates in the packet with maximum chocolates and
                        the packet with minimum chocolates given to the students is minimum.
 */
import java.util.Arrays;

public class ChocolateDistributionProblem {
    public int minDiff(int[] arr, int n) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        if (n == 0 || n == 1) {
            return 0; // No distribution possible
        }

        for (int i = 0; (i + n - 1) < arr.length; i++) {
            int diff = arr[i + n - 1] - arr[i];
            if (i == 0 || diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

    public static void main(String[] args) {
        ChocolateDistributionProblem sol = new ChocolateDistributionProblem();
        int[] arr = { 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 };
        int n = 7;
        System.out.println("Minimum difference is: " + sol.minDiff(arr, n));
    }
}
/* Time Complexity: O(n log n)
 Space Complexity: O(1) */