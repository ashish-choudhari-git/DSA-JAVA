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

TC-O(n) and SC-O(1)*/

import java.util.*;

public class MajorityElement2 {

    static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        //maximum possible element which are greater than n/2 is 1.
        //maximum possible element which are greater than n/3 is 2.
        //maximum possible element which are greater than n/4 is 3.
        
        // Step 1: Find two potential candidates
        int elem1 = 0;
        int elem2 = 0;
        int count1 = 0;
        int count2 = 0;
        
        for (int num : nums) {
            if (num == elem1){
                count1++;
            } else if (num == elem2){
                count2++;
            } else if (count1 == 0) { 
                elem1 = num; 
                count1 = 1;
             } else if (count2 == 0) { 
                elem2 = num; 
                count2 = 1;
             }
            else { 
                count1--; 
                count2--; 
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == elem1) count1++;
            else if (num == elem2) count2++;
        }
        
        if (count1 > n / 3) result.add(elem1);
        if (count2 > n / 3) result.add(elem2);
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] list = {1, 1,3,3, 5};
        System.out.println(majorityElement(list));
    }
}


