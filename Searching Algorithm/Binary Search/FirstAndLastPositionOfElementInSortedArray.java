/*Leetcode : 34. Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value. If target is not found in the array, return [-1, -1]. You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1] 

Time Comlexity: O(log n +log n)=> O(logn) 
Space Complexity:O(1)*/

import java.util.Arrays;

public class FirstAndLastPositionOfElementInSortedArray {
    static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        if (nums.length == 0) return result;

        // First occurrence 
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        if (left < nums.length && nums[left] == target) {
            result[0] = left; //left contain 7 and right contain just lesser number
        } else { 
            return result; 
        }

        //-----------------------

        // Last occurrence 
        left = result[0];
        right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        result[1] = right; //left contain just greater and right contain 7 element 

        //--------------------------

        return result;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,4,5,5};
        int target= 4;
        System.out.println(Arrays.toString(searchRange(arr, target)));

    }
}

//same logic,just by using function 

// //Binary search approach 1- Ceiling and floor 
// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int[] result = {-1, -1};

//         if (nums.length == 0) return result;

//         // First occurrence 
//         int start = search(nums, target, true);
//         int end = search(nums, target, false);

//         // Last occurrence 
//         result[0] = start;
//         result[1]= end;
        

//         return result;
//     }

//     static int search(int[] nums, int target, boolean findStartIndex){
//         int ans =-1;
//         int left = 0;
//         int right = nums.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (target > nums[mid]) {
//                 left = mid + 1;
//             } else if(target < nums[mid]) {
//                 right = mid - 1;
//             }else{
//                 ans = mid;
//                 if(findStartIndex == true){
//                     right = mid-1;
//                 }else{
//                     left = mid+1;
//                 }
//             }
//         }

//         return ans;
//     }
// }
