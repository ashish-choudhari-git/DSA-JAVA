/* Leetcdoe :416. Partition Equal Subset Sum

Given an integer array nums, return true if you can partition the array into two subsets such that the sum of the elements in both subsets is equal or false otherwise.

Example 1:
Input: nums = [1,5,11,5]
Output: true
Explanation: The array can be partitioned as [1, 5, 5] and [11].

Example 2:
Input: nums = [1,2,3,5]
Output: false
Explanation: The array cannot be partitioned into equal sum subsets. */


public class PartitionEqualSubsetSum {
    static boolean canPartition(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }

        // It is obvious that ,if total is odd then we cant split them in two parts
        if (total % 2 != 0) {
            return false; 
        }

        int target = total / 2;

        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }

        return dp[target];
    }

    public static void main(String[] args) {
        int[] arr = { 1,5,11,5};
        System.out.println(canPartition(arr));
    }
}
