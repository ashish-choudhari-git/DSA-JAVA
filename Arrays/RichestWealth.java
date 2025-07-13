/*Leetcode : 1672. Richest Customer Wealth

You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has. A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.

Brute force : Time Complexity: O(m*n)=O(N) and space complexity :O(1);

*/

public class RichestWealth {
    static int richest(int[][] arr){
        int max = Integer.MIN_VALUE;

        for(int[] outside : arr){
            int sum =0;
            for(int num:outside){
                sum += num;
            }
            if(max<sum){
                max= sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] in = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(richest(in));
    }
}
