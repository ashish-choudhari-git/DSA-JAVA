/*Leetcode: 852. Peak Index in a Mountain Array

You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease. Return the index of the peak element. Your task is to solve it in O(log(n)) time complexity.

Example 1
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1 

Time complexity : O(logn) and space complexity:O(1)   */


public class PeakIndexInMountainArray {
    static int peakIndex(int[] arr){
         int left = 0;
    int right = arr.length - 1;

    while (left < right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] > arr[mid + 1]) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }

    // At the end of the loop, left == right and pointing to peak
    return right; // left and right both works

    /*
    //Brute force
    public int peakIndexInMountainArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int ans =-1;

        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                ans=i;
            }
        }
        return ans;
    }*/
    } 

    public static void main(String[] args) {
    int[] arr ={1,2,3,4,5,3,2};
    System.out.println(peakIndex(arr));
}

}




