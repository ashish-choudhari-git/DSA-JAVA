/*Leetcode : 367. Valid Perfect Square

Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
You must not use any built-in library function, such as sqrt.

Example 1:
Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

Example 2:
Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer. */


public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        //it is obvious that square root lies between 1 to num/2 for num>3
        //so we do sqaure of each binary using binary search ,if we get that, we return tru
        if(num==0 || num==1){
            return true; //0 and 1 are always perfect sqaure
        }

        int i=1;
        int j= num/2;

        while(i<=j){
            int mid = i + (j - i) / 2;
            long sq = (long) mid * mid; //int didnt worked

            if(sq == num) {
                return true;
            }else if( sq < num){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }

        return false;
    }
}
