/* 
problem:  Shifting Letters

You are given a string s of lowercase English letters and an integer array shifts of the same length.
Call the shift() of a letter, the next letter in the alphabet, (wrapping around so that 'z' becomes 'a').
For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.
Now for each shifts[i] = x, we want to shift the first i + 1 letters of s, x times.
Return the final string after all such shifts to s are applied.

Example 1:
Input: s = "abc", shifts = [3,5,9]
Output: "rpl"
Explanation: We start with "abc".
After shifting the first 1 letters of s by 3, we have "dbc".
After shifting the first 2 letters of s by 5, we have "igc".
After shifting the first 3 letters of s by 9, we have "rpl", the answer.

   time complexity : O(n)
   space complexity : O(n) bcz of result array
*/

public class ShiftLetters {

    public static void main(String[] args) {
        String s = "abc";
        int[] shifts = {3, 5, 9};

        ShiftLetters obj = new ShiftLetters();
        String result = obj.shiftingLetters(s, shifts);
        System.out.println("Output: " + result); 
    }

    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();
        long totalShift = 0;
        char[] result = new char[n];

        for (int i = n - 1; i >= 0; i--) {
            totalShift = (totalShift + shifts[i]) % 26;
            result[i] = shiftChar(s.charAt(i), (int) totalShift);
        }

        return new String(result);
    }

     char shiftChar(char c, int shift) {
        return (char) ((c - 'a' + shift)+ 'a'); // c is 99 in ascii Value ,when we minus 'a'(which is 97) , we get 3. hence,we converted char to int ,then we add shift ,then reverse to char by adding 'a'
    }
}
