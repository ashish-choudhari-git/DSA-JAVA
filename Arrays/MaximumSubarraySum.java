/*
Problem: Maximum Subarray Sum (Kadane's Algorithm)
Description: Given an integer array nums, find the contiguous subarray (containing at least one number)
             which has the largest sum and return its sum.
*/
public class MaximumSubarraySum {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0]; 
        int maxSum = nums[0];      

        for (int i = 1; i < nums.length; i++) {
            // Either take the current number alone or extend the previous subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update maxSum if currentSum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        MaximumSubarraySum solution = new MaximumSubarraySum();
        int[] inputArray = {1, 2, 3, 4};
        int maxSubarraySum = solution.maxSubArray(inputArray);
        System.out.println("Maximum subarray sum is: " + maxSubarraySum);
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/
