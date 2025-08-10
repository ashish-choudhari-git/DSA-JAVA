/* Leetcode : 69. Sqrt(x)

Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
Example 1:
Input: x = 4
Output: 2

Example 2:
Input: x = 8
Output: 2 */

public class SquareRoot {
    public int mySqrt(int x) {
        // sqrt of number x lies between 1 to x/2
        if (x < 2) return x;
        int start =1;
        int end = x/2;
        int ans=0;

        while(start<=end){
            int mid = start + (end- start) /2;

            if (mid <= x/mid) {
                ans = mid;      
                start = mid + 1; //trying to find bigger sqrt 
            } else {
                end = mid - 1;  
            }
        }

        return ans;
    }
}
