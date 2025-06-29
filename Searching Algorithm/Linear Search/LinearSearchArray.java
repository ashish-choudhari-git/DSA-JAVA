//return index of target element if found in array
public class LinearSearchArray {
   public static void main(String[] args) {
      int[] arr = { 23, 35, 467, 33, 576, 2389, 324, 11, 67, 223 };
      short target = 576;
      int result = search(arr, target);
      if (result == -1) {
         System.out.println("Element not found in the array.");
      } else {
         System.out.println("Element is found at index " + result);
      }
   }

   static int search(int[] arr, int target) {
      if (arr.length == 0) {
         return -1;
      } else {
         for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
               return i;
            }
         }

         return -1;
      }
   }
}
