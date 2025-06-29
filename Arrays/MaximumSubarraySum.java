/*
Problem: Maximum Subarray Sum (Kadane's Algorithm)
Description: Given an integer array nums, find the contiguous subarray (containing at least one number)
             which has the largest sum and return its sum.
*/
public class MaximumSubarraySum {
    static int maxSubArray(int[] nums) {
        int currentSum = nums[0]; 
        int maxSum = nums[0];     
         
        for(int i =1; i< nums.length;i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int maxSubarraySum = maxSubArray(arr);
        System.out.println("Maximum subarray sum is: " + maxSubarraySum);
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/
