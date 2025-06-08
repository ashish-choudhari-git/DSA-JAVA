import java.util.Arrays;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate sol = new ContainsDuplicate();
        int[] nums2 = {1, 2,3, 3, 1} ;
        System.out.println(sol.containsDuplicate(nums2)); 
    }
}

/* Time Complexity: O(n log n)
   Space Complexity: O(1) */ 