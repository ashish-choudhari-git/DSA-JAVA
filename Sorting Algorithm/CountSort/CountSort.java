//we need difference betweek max and minimum bumber to be smaller, or max number should be not large. We will store frequency of each number on their index, like number is 31 then we jo to 31 and increase frequency count by 1, then if agaiin that number comes, then we again increase then index value by 1. at last we traverse array from start adn print index  ,frequncy time  then finally we will be getting sorted array.
import java.util.Arrays;
public class CountSort {
    public static void countSort(int[] arr){
        int largest = Integer.MIN_VALUE;

        for(int i=0;i< arr.length;i++){
            largest = Math.max( largest, arr[i]); //finding max element
        }

        int[] count = new int[largest + 1]; // 0 needed to be included as we are dealing with only +ve number
        for(int i=0;i< arr.length;i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0; //for original array
        for(int i=0;i< count.length;i++){
            while(count[i] >0){
                arr[j] =i;
                j++;

                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {8,5,2,7,6,2};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
