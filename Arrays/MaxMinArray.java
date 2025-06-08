/*
 Problem: Find Maximum and Minimum in Array
  Description: Given an array of integers, find the maximum and minimum values in the array.
               This file contains three different approaches to solve the problem:
               1. Using Sorting
               2. Using Linear Search
               3. Using Tournament Method (Divide and Conquer)

 */

// import java.util.Arrays;
/* 
 * public class MaxMinArray {
    // Method 1: Using Sorting
    public static void findMinMaxUsingSort(int[] arr) {
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
   public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println("Method 1 - Using Sorting:");
        findMinMaxUsingSort(arr);  
    }
}
*/

/*
// Method 2: Using Linear Search
 public class MaxMinArray {
    public static void findMinMaxLinear(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

   public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("\nMethod 2 - Using Linear Search:");
        findMinMaxLinear(arr);
    }
} 
 */

/*
  // Method 3: Using Tournament Method (Divide and Conquer)
 public class MaxMinArray {
    static class Pair {
        int min;
        int max;
    }

    static Pair findMinMaxTournament(int[] arr, int low, int high) {
        Pair minmax = new Pair();
        
        // Base case: one element
        if (low == high) {
            minmax.min = arr[low];
            minmax.max = arr[low];
            return minmax;
        }

        // Base case: two elements
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minmax.max = arr[low];
                minmax.min = arr[high];
            } else {
                minmax.max = arr[high];
                minmax.min = arr[low];
            }
            return minmax;
        }

        // Recursive case
        int mid = (low + high) / 2;
        Pair minmaxLeft = findMinMaxTournament(arr, low, mid);
        Pair minmaxRight = findMinMaxTournament(arr, mid + 1, high);

        // Compare results from left and right halves
        minmax.min = Math.min(minmaxLeft.min, minmaxRight.min);
        minmax.max = Math.max(minmaxLeft.max, minmaxRight.max);

        return minmax;
    }
      public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
   
        System.out.println("\nMethod 3 - Using Tournament Method:");
        Pair result = findMinMaxTournament(arr, 0, arr.length - 1);
        System.out.println("Minimum: " + result.min +" "+ "Maximum: " + result.max);
    }
} 

 */

/*  
Time Complexity of Method 1 (Sorting): O(n log n) &method 2 & 3 has O(n) 
 Space Complexity of Method 1 & 2 is O(1)  and Method 3  is O(log n) due to recursion stack
 */