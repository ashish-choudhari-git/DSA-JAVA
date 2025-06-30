/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.You may assume that each input would have exactly one solution, and you may not use the same element twice. */

//brute force
// t-O(n2) and O(1) 
public class twoSumandIndices {

    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int[] arr= new int[2];

        while(i< nums.length-1){
            for(int j=i+1; j< nums.length;j++){
                if(nums[i]+ nums[j]==target){
                        arr[0]=i;
                        arr[1]=j;
                }
                }
                // for(int j=i; j< nums.length;j++){
                // if(nums[j]+ nums[j-1]==target){
                //         arr[0]=i;
                //         arr[1]=j;
                // }
                // }
                 i++; 
            }
             return arr;
        }
    }

//Hashmaps O(n) and spce is too O(n)
// import java.util.HashMap;

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         for (int i = 0; i < nums.length; i++) {
//             int req = target - nums[i];
            
//             if (map.containsKey(req)) {
//                 return new int[] { map.get(req), i };
//             }
            
//             map.put(nums[i], i);
//         }
        
//         return new int[] {};  
//     }
// }


