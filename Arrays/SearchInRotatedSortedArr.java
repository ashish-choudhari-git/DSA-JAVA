/* Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums. */
public class SearchInRotatedSortedArr {
   
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
        }
        return -1; 
    
}

}
/* time complexity- O(n)
  space complexity- O(1)
 */
