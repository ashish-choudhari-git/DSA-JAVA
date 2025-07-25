/*Leetcode: 2149. Rearrange Array Elements by Sign

You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should return the array of nums such that the the array follows the given conditions:
1.Every consecutive pair of integers have opposite signs.
2.For all integers with the same sign, the order in which they were present in nums is preserved.
3.The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

Example 1:
Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4] */


// import java.util.Arrays;
public class RearrangeArrayElementBySign {
    static int[] rearrangeArray(int[] nums) {
        int n =nums.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];

        int posIndex = 0, negIndex = 0;

        for (int num : nums) {
            if (num > 0) {
                pos[posIndex++] = num;
            } else {
                neg[negIndex++] = num;
            }
        }

        int[] result = new int[n];
        posIndex = 0;
        negIndex = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = pos[posIndex++];
            } else {
                result[i] = neg[negIndex++];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // int[] arr ={3,1,-2,-5,2,-4};
        // System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
}
