/*Leetcode : 81. Search in Rotated Sorted Array II

There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].
Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.
You must decrease the overall operation steps as much as possible.

Example 1:
Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true

Example 2:
Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false 

TC : O(logn) and SC : O(1)
*/


public class SearchinRotatedSortedArrayII {
    public boolean search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr.length == 1) {
            return arr[0] == target;
        }

        int pivot = findPivot(arr);
        if (pivot == -1) {
            return binarySearch(arr, target, 0, end) != -1;
        }

        //check pivot element first
        if (arr[pivot] == target)
            return true;

        int front = binarySearch(arr, target, start, pivot - 1);
        if (front != -1)
            return true;

        return binarySearch(arr, target, pivot + 1, end) != -1;

    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            //4 cases

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            //if mid is pivot that it would have caught here, hence mid is not pivot then jo next case
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }

        if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1]){
                    return start;
                } 
                start++;
                if (end > start && arr[end - 1] > arr[end]){
                    return end - 1;
                } 
                end--;
            } 
            else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    

    static int binarySearch(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midVal = arr[mid];

            if (midVal == target) {
                return mid;
            } else if (midVal > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
