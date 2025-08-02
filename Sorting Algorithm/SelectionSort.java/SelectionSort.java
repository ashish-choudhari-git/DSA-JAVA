/*
time complexity : O(n^2)

Space complexity : O(1)
 */
import java.util.Arrays;
public class SelectionSort {
    static void selectionSort(int[] arr){
        for(int i =0;i< arr.length-1;i++){

            int minPos =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]> arr[j]){
                    minPos = j;
                }
            }

            //swap
            int temp = arr[minPos];
            arr[minPos]= arr[i];
            arr[i] = temp;

            //for decreasing order
            // int maxPos =i;
            // for(int j=i+1;j<arr.length;j++){
            //     if(arr[maxPos]< arr[j]){
            //         maxPos = j;
            //     }
            // }

            

            // int temp = arr[maxPos];
            // arr[maxPos]= arr[i];
            // arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int [] arr = {8,5,2,7,6,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
