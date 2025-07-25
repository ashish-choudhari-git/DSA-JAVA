/*Leetcode: 136. Single Number

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one. You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1 */


public class SingleNumber {
    static int singleNumber(int[] nums) {
        int xor = 0;
        for(int i=0; i<nums.length; i++){
            xor = xor ^ nums[i];// if two number are same xor will be 0 ,and id one is non zero number and other is 0 then result is same non zero number. when we sequentially xor one by one, duplicaet will be 0, and only 1 single element will be left at the end with xor.
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr ={1,3,3,2,2};
        System.out.println(singleNumber(arr));
    }
}
