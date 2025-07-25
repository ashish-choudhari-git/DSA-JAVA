/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
Example:
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_] */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1; 
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
            nums[k] = nums[i];
            k++;
        }
        }
        return k;
    }
}
/*Time Complexity: O(n)
 Space Complexity: O(1)
 */
