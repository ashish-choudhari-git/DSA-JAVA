/*Leetcode : 1572. Matrix Diagonal Sum

Given a square matrix mat, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

Example 1:
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25

Example 2:
Input: mat = [[5]]
Output: 5 
*/


public class DiagonalSum {
    // static int diagSum(int[][] arr, String str) {
    //     int ans = 0;
    //     if (str.equals("primary")) {
    //         for (int i = 0; i < arr.length; i++) {
    //             ans += arr[i][i];
    //         }
    //     } else if (str.equals("secondary")) {
    //         for (int i = arr.length - 1; i >= 0; i--) {
    //             ans += arr[arr.length - 1 - i][i];
    //         }
    //     }
    //     return ans;
    // }

    // public static void main(String[] args) {
    //     int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    //     System.out.println("Primary sum = " + diagSum(arr, "primary"));
    //     System.out.println("Secondary sum = " + diagSum(arr, "secondary"));
    // }
    public int diagonalSum(int[][] arr) {
        int ans = 0;

        if(arr.length==1){
            return arr[0][0];
        }

        int skip =-1;

        if(arr.length%2 !=0){
            skip = arr.length/2;
        }

        for (int i = 0; i < arr.length; i++) {
            ans += arr[i][i];
        } 

        for (int i = arr.length - 1; i >= 0; i--) {
            if( i == skip){
                continue;
            }
            ans += arr[arr.length - 1 - i][i];
        }
        
        return ans;
    }
}


    

