/*
Problem: 153. Find Minimum in Rotated Sorted Array -leetcode

Suppose an array of length n sorted in ascending order is rotated between 1 and n times. You are given a rotated version of that array, with unique elements, and you need to return the minimum element.

Example:
Input:  nums = [3,4,5,1,2]
Output: 1
Explanation:
Original sorted array: [1,2,3,4,5]
Rotated 3 times → [3,4,5,1,2]

Time Complexity: O(log n) 
Space Complexity: O(1) 
*/

public class MinimumInRotatedSortedArray {
    static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid; 
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println("Minimum element in rotated sorted array: " + findMin(nums));
    }
}
