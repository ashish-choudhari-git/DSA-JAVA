/*Leetcode : 74. Search a 2D Matrix, search in sorted array

You are given an m x n integer matrix matrix with the following two properties:
Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.
You must write a solution in O(log(m * n)) time complexity.

Example 1:
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

Example 2:
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false 

Approach : Ladder problem*/

public class SearchIn2DArray {
    public boolean searchMatrix(int[][] matrix, int target) {
        //case 1: (0,m-1)
        // int row =0; 
        // int col= matrix[0].length -1;

        // while(col >=0 && row <= matrix.length-1){
        //     int curr = matrix[row][col];

        //     if(target == curr){
        //         return true;  
        //         }
        //         else if(curr < target){
        //         row++;
        //     }else{
        //         col--;
        //     }
        // }

        // return false;

        //case 2 : (n-1,0)
        int row =matrix.length -1; 
        int col= 0;

        while(col <=matrix[0].length -1  && row >=0){
            int curr = matrix[row][col];

            if(target == curr){
                return true;  
            }
            else if(target > curr){
                col++;
            }else{
                row--;
            }
        }

        return false;
    }
}
