public class RotatedArray {
   
    static void rotate(int[] arr, int k) {
        int n =arr.length;
        k= k % n;

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }

    static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[end];
            arr[end]= arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,98,7,9,3,2,3};
        rotate(arr,14);

        for(int i = 0; i < arr.length; ++i) {
         System.out.print(arr[i]+" " );

    }
    }
    
}

