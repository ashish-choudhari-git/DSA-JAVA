/*
Time Complexity :
worst case : O(n^2);
best case : O(n);

Space complexity : O(1)
*/
import java.util.Arrays;
public class BubbleSort{
    static void bubbleSort(int[] arr){
        for(int turn =0; turn < arr.length;turn++){

            boolean swapping = false;
            for(int j=0; j< arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){ //for increasing order ">" and for decreasing order "<"
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                    swapping = true;
                }
            }

            if(swapping == false){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {5,7,3,8,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
