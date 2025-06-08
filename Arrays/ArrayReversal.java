/*
  Problem: Array Reversal
  Description: Reverse the elements of an array in-place. This file demonstrates four different approaches:
               1. Using two-pointer technique with for loop
               2. Using two-pointer technique with while loop
               3. Using temporary array (naive approach)
               4. Using Collections.reverse() for ArrayList
             
 */
// import java.util.*;
/* public class ReverseUsingForLoop {
    public static void reverseUsingForLoop(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Reversed (For Loop): " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseUsingForLoop(arr);
    }
}*/

/*class ReverseUsingWhileLoop {
    public static void reverseUsingWhileLoop(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed (While Loop): " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseUsingWhileLoop(arr);
    }
} */

/*class ReverseUsingTempArray {
    public static void reverseUsingTempArray(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - 1 - i];
        }
        System.out.println("Reversed (Temp Array): " + Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseUsingTempArray(arr);
    }
} */

/* class ReverseUsingCollections {
    public static void reverseUsingCollections(List<Integer> list) {
        Collections.reverse(list);
        System.out.println("Reversed (Collections): " + list);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverseUsingCollections(list);
    }
}
 */

/*   Time Complexity of method 1 and 2 is  O(n/2) = O(n)
    Time Complexity of method 3 and 4 is  O(n)
  
    Space Complexity of Method 1 & 2 & 4 (Two-pointer): O(1)
    Space Complexity of Method 3 (Temporary array): O(n)
 
*/