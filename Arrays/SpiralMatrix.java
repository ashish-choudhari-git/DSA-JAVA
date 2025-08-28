/*Leetcode : 54. Spiral Matrix

Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7] */


import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
     public List<Integer> spiralOrder(int[][] matrix) {
        // List<Integer> ans = new ArrayList<>();

        // int top = 0;
        // int bottom = matrix.length - 1;
        // int left = 0;
        // int right = matrix[0].length - 1;

        // while (top <= bottom && left <= right) {
        //     //left to right
        //     for (int i = left; i <= right; i++) {
        //         ans.add(matrix[top][i]);
        //     }
        //     top++;

        //     // top to bottom
        //     for (int i = top; i <= bottom; i++) {
        //         ans.add(matrix[i][right]);
        //     }
        //     right--;

        //     if (left <= right && top <= bottom) {
        //         //right to left
        //         for (int i = right; i >= left; i--) {
        //             ans.add(matrix[bottom][i]);
        //         }
        //         bottom--;
        //     }

        //     if (top <= bottom && left <= right) {
        //         for (int i = bottom; i >= top; i--) {
        //             ans.add(matrix[i][left]);
        //         }
        //         left++;
        //     }

        // }

        // return ans;



        List<Integer> ans = new ArrayList<>();

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endCol && startCol <= endCol) {
            //left to right 
            for(int j=startCol;j<= endCol;j++){
                ans.add(matrix[startRow][j]);
            }

            //top to bottom
            for(int i=startRow+1;i<= endRow;i++){
                ans.add(matrix[i][endCol]);
            }

            //bottom right to left
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                ans.add(matrix[endRow][j]);
            }

            //bottom to top
            for(int i=endRow-1;i>= startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                ans.add(matrix[i][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return ans;
    }
}
