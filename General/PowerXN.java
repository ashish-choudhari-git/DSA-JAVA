/*Leetcode : 50. Pow(x, n)

Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Example 1:
Input: x = 2.00000, n = 10
Output: 1024.00000

Example 2:
Input: x = 2.10000, n = 3
Output: 9.26100

Example 3:
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25 */


class PowerXN {
    public double myPow(double x, int n) {
        //return Math.pow(x,n)
        if (n < 0) {
            return 1 / calc(x,n); 
        } else {
            return calc(x, n);
        }
    }

    private double calc(double x, long n) {
        if (n == 0) return 1;
        if (n == 1) return x;

        double half = calc(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x; //power even * power 1 => odd power
        }
    }

    //more optimized
    // static int calc(int a,int n){
    //     int ans = 1;

    //     while(n>0){
    //         if((n&1) !=0 ){
    //             ans = ans * a;
    //         }
    //         a =a *a;
    //         n= n>>1;
    //     }

    //     return ans;
    // }

    // public static void main(String[] args) {
    //     System.out.println(calc(15,2));
    // }
}
