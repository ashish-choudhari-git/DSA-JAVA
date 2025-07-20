/*
 Leetcode : 33. Search in Rotated Sorted Array
 
Brute force -> Linear Search
Optimal -> Binary Search

Example 1:
    Input: nums = [4,5,6,7,0,1,2], target = 0
    Output: 4
Example 2:
    Input: nums = [4,5,6,7,0,1,2], target = 3
    Output: -1
time complexity : O(logn) and scace complexity : O(1)
 */



public class SearchInRotatedSortedArray {
    public int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;

            // LEFT half is sorted, if left is sorted then we will check if target lies betwwen left and mid or not , if yes them right= mid-1 else left = mid+1
            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // RIGHT half is sorted, will check if target lies between this, if yes left= mid+1 else right =mid-1
            else {
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;

    }
}
