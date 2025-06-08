/* 
mETHOD 1->
import java.util.Arrays;

public class MaxMinArray {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(arr);  
        int min = arr[0];  
        int max = arr[arr.length - 1]; 
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}


Time Complexity: O(n log n)
Space Complexity: O(1)
*/


/* 
Method 2->
public class MaxMinArray{
    public static void main(String args[]){
        int[] arr = {10, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min=INTEGER.MAX_VALUE;
        int max=INTEGER.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
         if(max<arr[i]){
            max= arr[i];
         }
         if(min>arr[i]){
            min= arr[i];
         }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}

Time Complexity: O(n)
Space Complexity : O(1)
*/


/* 
Tournament Method->


public class MaxMinArray {

    static class Pair {
        int min;
        int max;
    }

    static Pair minMax(int[] arr, int low, int high) {
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
        Pair minmaxLeft = minMax(arr, low, mid);
        Pair minmaxRight = minMax(arr, mid + 1, high);

        // Compare results from left and right halves
        minmax.min = Math.min(minmaxLeft.min, minmaxRight.min);
        minmax.max = Math.max(minmaxLeft.max, minmaxRight.max);

        return minmax;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Pair result = minMax(arr,0, arr.length - 1);
        System.out.println("Minimum of array : " + result.min);
        System.out.println("Maximum of array: " + result.max);
    }
}


Time Complexity: O(n)
Space Complexity: O(log n)
*/
