/*
You are given a read only array of n integers from 1 to n. Each integer appears exactly once except A which appears twice and B which is missing. Return A and B.
Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?Note that in your output A should precede B.
Example:
Input:[3 1 2 5 3] 
Output:[3, 4]
*/
public class RepeatandMissingNumber {

    public int[] repeatedNumber(final int[] A) {
        int n = A.length;
        int repeated = -1;
        int missing = -1;

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = A[i];
        }
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
           
                repeated = Math.abs(nums[i]);
            } else {
              
                nums[index] = -nums[index];
            }
        }

     
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
            
                missing = i + 1;
                break;
            }
        }

        return new int[]{repeated, missing};
    }
}

