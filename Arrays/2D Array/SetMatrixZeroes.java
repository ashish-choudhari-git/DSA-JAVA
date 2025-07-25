/*Leetcode: 73. Set Matrix Zeroes

Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's. You must do it in place.

Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Example 2:
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]*/

import java.util.*;

public class SetMatrixZeroes {
    static void setZeroes(int[][] matrix) {
        List<int[]> zeroPositions = new ArrayList<>();
        // when we find 0 , we will add to arraylist

        // first we iterate over whole array and find where 0 lies and store their
        // coordinates
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroPositions.add(new int[] { i, j });
                }
            }
        }

        // iterate over zeroPosition list one by one
        for (int[] pos : zeroPositions) {
            int row = pos[0];
            int col = pos[1];

            for (int j = 0; j < matrix[0].length; j++) {
                matrix[row][j] = 0;
            } // making all row element 0

            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            } // making all col element 0
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
