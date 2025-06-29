import java.util.Arrays;

public class MaxMinArray {
    public static void findMinMaxLinear(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        if(arr.length==0){
            System.out.println("array is empty");
        }
        for (int i = 1; i < arr.length; i++) {
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
        System.out.println(Arrays.toString(arr));
        findMinMaxLinear(arr);
    }
} 