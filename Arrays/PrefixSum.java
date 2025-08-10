// import java.util.Arrays;
public class PrefixSum {
//Time complexity - O(n) and SC :O(N) 
    public static void main(String[] args) {
        // int arr[] = {8,6,4,3,6,0,7};
    }

    
    /* Time complexity - O(n^2) and SC :O(N) --- time Complexity is O(n^2) beacuse for each element we calculating preffix from scratch
    public static void main(String[] args) {
        int arr[] = {8,6,4,3,6,0,7};

        int[] prefix = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            prefix[i] = prefixSum(arr,i);
        }

        System.out.println(Arrays.toString(prefix));
    }

    static int prefixSum(int[] arr, int end){
        if(end==0){
            return arr[0];
        }
        return prefixSum(arr, end-1)+ arr[end];
    }

    */
}
