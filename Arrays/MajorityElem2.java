/*Leetcode : 229. Majority Element II

Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Example 1:
Input: nums = [3,2,3]
Output: [3]

Example 2:
Input: nums = [1]
Output: [1]

Example 3:
Input: nums = [1,2]
Output: [1,2]
 */


import java.util.ArrayList;
import java.util.List;

public class MajorityElem2 {
    static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        //Boyer-Moore Voting Algorithm

        //maximum possible element which are greater than n/2 is 1.
        //maximum possible element which are greater than n/3 is 2.
        //maximum possible element which are greater than n/4 is 3.

        int elem1 = 0;//may be nums is of size of 1,2 that's why I didn't start with 0th and 1st 
        int elem2 = 0;
        int count1 = 0;
        int count2 = 0;
        
        //first we find which are two elements
        for (int num : nums) {
            if (num == elem1){
                count1++;
            } else if (num == elem2){
                count2++;
            }
            //------------------------- 
            else if (count1 == 0) { 
                elem1 = num; 
                count1 = 1;
             } 
            else if (count2 == 0) { 
                elem2 = num; 
                count2 = 1;
             }
             //------------------------
            else { 
                count1--; 
                count2--; 
            }
        }
        
        //actual conting of elements
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == elem1) count1++;
            else if (num == elem2) count2++;
        }
        
        if (count1 > n / 3) ans.add(elem1);
        if (count2 > n / 3) ans.add(elem2);
        
        return ans;
    }

    // public List<Integer> majorityElement(int[] nums) {
    //     List<Integer> ans = new ArrayList<>();
    //     int n = nums.length;
    //     int minCount = n / 3;

    //     //brute force----------------------------TC-O(n^2) and SC-O(1)
    //     for (int i = 0; i < n; i++) {
    //         //if already counter,skip it
    //         if (ans.contains(nums[i])) continue;

    //         int count = counter(nums, nums[i]); 

    //         if (count > minCount) {
    //             ans.add(nums[i]);
    //         }
    //     }
    //     return ans;
    // }

    // static int counter(int[] arr, int k) {
    //     int count = 0;
    //     for (int num : arr) {
    //         if (num == k) count++;
    //     }
    //     return count;
    // }
}
