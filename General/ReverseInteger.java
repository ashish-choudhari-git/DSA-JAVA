/*Leetcode : 7. Reverse Integer

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21 */

public class ReverseInteger {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }

        int result = 0;

        while (x != 0) {
            int last = (x % 10);
            
            if ((result == Integer.MAX_VALUE / 10 && last > 7) || result > Integer.MAX_VALUE / 10 || (result < Integer.MIN_VALUE / 10) || ((result == Integer.MIN_VALUE / 10 && last < -8))) {
                return 0;
            }
            
            result =  (result *10) + last;
            x /= 10;
        }
        return result;
    }
}
