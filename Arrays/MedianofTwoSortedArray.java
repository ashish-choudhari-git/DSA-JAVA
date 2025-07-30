/*Leetcode : 4. Median of Two Sorted Arrays

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5. */


import java.util.ArrayList;
import java.util.List;

public class MedianofTwoSortedArray {
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //My approach : I will create a sorted array by combining nums1 and nums2. then find median of resultant sorted array
        //TC = O(m + n) and SC = O(m + n)
        int[] sorted= mergedSorted(nums1,nums2);

        int n= sorted.length;

        if(n%2==0){
            int mid1 = (n/2)-1;
            int mid2 = (n/2);
            return (sorted[mid1] + sorted[mid2])/2.0;
        }else{
            return sorted[n/2];
        }
    }

    static int[] mergedSorted(int[] nums1, int[] nums2){
        List<Integer> list = new ArrayList<>();

        int i=0;
        int m = nums1.length;
        int j=0;
        int n= nums2.length;

        while(i<m && j<n){
            if (nums1[i] <= nums2[j]) {
                list.add(nums1[i++]);
            } else {
                list.add(nums2[j++]);
            }
        }

        //if nums1 has remaining element
        while (i < m){
            list.add(nums1[i++]);
        }

        //if nums2 has remaining element
        while (j <n){
            list.add(nums2[j++]);
        }

        return list.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4};
        int[] arr2 = {6,7,8};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
}
