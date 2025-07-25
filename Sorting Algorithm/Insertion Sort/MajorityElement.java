/*Leetcode: 169. Majority Element

Given an array nums of size n, return the majority element. The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2 */


public class MajorityElement {
    static int majorityElement(int[] nums){
        insertionSort(nums);
        return nums[nums.length/2];// more than n/2 means 100% that element occur in middle 
    }
    static void insertionSort(int[] arr){
        for(int i=0; i< arr.length-1; i++){
            int k = i;
            int curr = arr[i+1];
            while(k >=0 && arr[k] < curr){
                arr[k+1] = arr[k];
                k--;

            }
            arr[k+1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr ={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}
