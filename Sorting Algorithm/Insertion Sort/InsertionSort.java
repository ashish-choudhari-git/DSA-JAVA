/*
Time complexity : O(N)
Space Complexity: O(1)
 */

import java.util.Arrays;
public class InsertionSort {

    static void insertionSort(int[] arr){
        for(int i=1; i< arr.length ; i++){
            int curr = arr[i];
            int prev =i-1;
            
            //finding correct position to insert
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            //inserting
            arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        int [] arr = {8,5,2,7,6,2};
        // Integer [] arr = {8,5,2,7,6,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
