/* Leetcode: 722.  Given asc order array. There are at least two different characters in letters. Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters. 
 Ex:
 Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

Input: letters = ["x","x","y","y"], target = "z"
Output: "x"


Time Complexity: O(logn)
space Complexity: O(1)
 */

public class SmallestNumberGreaterThanTarget {
    static char nextGreatestLetter(char[] arr, char target) {

        int left = 0;
        int right = arr.length - 1;

        // if (target >= arr[right]) { // >= because we wonly want greater value, the greater value after alst element               // will be 0th element according to the question
        //     return arr[0];
        // }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return arr[left % arr.length];
    }

    public static void main(String[] args) {
        char[] arr = { 'c', 'd', 'f', 'i', 'n', 'r', 'y' };
        char target = 'z';
        System.out.println(nextGreatestLetter(arr, target));
    }
}