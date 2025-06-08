import java.util.Arrays;
class ContainDuplicate {
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
        ContainDuplicate sol = new ContainDuplicate();
        int[] nums2 = {1, 2,3, 3, 1} ;
        System.out.println(sol.containsDuplicate(nums2)); 
    }
}
