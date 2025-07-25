/*Leetcode: 287. Find the Duplicate Number

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number. You must solve the problem without modifying the array nums and using only constant extra space.


Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3 */

// import java.util.Arrays;

public class FindDuplicateNumber {
    static int findDuplicate(int[] nums) {
       boolean check[] = new boolean[nums.length]; //by default all are false
        for(int i = 0; i < nums.length; i++){
            if(check[nums[i]]){ //if duplicate number appeared,it will be true in that position
                return nums[i];
            }
            check[nums[i]] = true; //unique element will make that position "true"
        }
        return -1;
    }

    // public int findDuplicate(int[] nums) {
    //     Arrays.sort(nums); 
    //     for (int i = 1; i < nums.length; i++) {
    //         if (nums[i] == nums[i - 1]) {
    //             return nums[i];
    //         }
    //     }
    //     return -1;
    // }

    public static void main(String[] args) {
        int[] arr ={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
}
