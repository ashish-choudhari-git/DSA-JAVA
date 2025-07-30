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
        List<Integer> ans = new ArrayList<>();

        int t = 0;
        int b = matrix.length - 1;
        int l = 0;
        int r = matrix[0].length - 1;

        while (t <= b && l <= r) {
            //left to right
            for (int i = l; i <= r; i++) {
                ans.add(matrix[t][i]);
            }
            t++;

            // top to bottom
            for (int i = t; i <= b; i++) {
                ans.add(matrix[i][r]);
            }
            r--;

            if (l <= r && t <= b) {
                //right to left
                for (int i = r; i >= l; i--) {
                    ans.add(matrix[b][i]);
                }
                b--;
            }

            if (t <= b && l <= r) {
                for (int i = b; i >= t; i--) {
                    ans.add(matrix[i][l]);
                }
                l++;
            }

        }

        return ans;
    }
}
