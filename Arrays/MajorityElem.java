/*Leetcode: 169. Majority Element

Given an array nums of size n, return the majority element. The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2 */


public class MajorityElem {
    static int majorityElement(int[] nums) {
        
        int count =0;
        int maxElement=0; // if first element is occuring again and again ,we will increase count and if diff element occur next to it,we we decrease coutn ,if count becomes zero this means next element is more than previous one. as there is 100% guarantee that one element occur more than n/2, we can use 1 element as king.

        for (int num : nums) {
            if (count == 0) {
                maxElement = num;
            }
            count += (num == maxElement) ? 1 : -1;
        }

        return maxElement;
        
    }

    public static void main(String[] args) {
        int[] arr ={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}
