/*Leetcode : 560. Subarray Sum Equals K

Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2

Example 2:
Input: nums = [1,2,3], k = 3
Output: 2 */


public class SubarraySumEqualsK {
    static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        /*
        //brute froce 
        int[] totalsum = new int[n+1];
        totalsum[0]= 0;
        
        for(int i=0;i<n;i++){
            totalsum[i+1] += nums[i];
        }
        //1st position is 0 , then adding one by and storing total sum
        
        for(int i=0;i<n;i++){ //outer pointer
            for(int j=i;j<n;j++){ //inner pointer
                sum= totalsum[j+1] - totalsum[i]; 
                if(sum==k){
                    count++;
                }
            }
        }
        */

        //better than brute froce
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {

                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={1,1,1,1,1,1,1,1};
        int k=2;
        System.out.println(subarraySum(nums,k));
    }
}
