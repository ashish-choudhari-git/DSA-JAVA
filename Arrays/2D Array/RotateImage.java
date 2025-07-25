/*Leetcode: 48. Rotate Image

You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise). You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

Example 2:
Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]*/

public class RotateImage {
    static void rotate(int[][] matrix) {
        //Its recommended to not use another 2d array and do rotation but trying brute force    
        int n=matrix.length;
        int m= matrix[0].length;
        int[][] image = new int[n][m];

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                image[j][n - 1 - i] = matrix[i][j];
            }
        }
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                matrix[i][j] = image[i][j];
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
