/*
Leetcode : 283. Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements. Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
 */

import java.util.Arrays;

public class MoveZeroes {
    static void moveZeroes(int[] nums) {
        int k=0; //insert position

        for(int i=0;i<nums.length;i++){ //moving all non zero to front
         if(nums[i]!=0){
            nums[k] =nums[i];
            k++;
         }
        }

        for(int i=k;i<nums.length;i++){ //last insert will give k+1, so now from k to length-1 , we have to assign 0
            nums[i]=0;
        }
    }

    public static void main(String[] args) {
        int[] arr ={1,0,2,3,40,5,0,0,0,2};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
