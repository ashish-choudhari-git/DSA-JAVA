/*Leetcode : 268. Missing Number

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation:
n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2 */


public class MissingNumber {
    static int missingNumber(int[] nums) {
   int n = nums.length;
   /*  int xor =0;
     
     for(int i=0;i<=n;i++){
        xor ^= i; //this will give total sum
     }

     for(int i=0;i<n;i++){
        xor ^= nums[i]; //repeated number will diminish and left is missing number.
     }

     return xor;
     */

    /* solution 2:
     Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;
     */

     //solution 3

     int totalSum = n*(n+1)/2;
     for (int i = 0; i < n; i++) {
            totalSum -= nums[i];
        }
    return totalSum;

    }

    public static void main(String[] args) {
        int[] arr ={0,1,3};
        System.out.println(missingNumber(arr));
    }
}
