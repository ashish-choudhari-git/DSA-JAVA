public class SortedCheck {

    static boolean checksorted(int[] arr, int start){
        if(start == arr.length-1){
            return true;
        }
        // if(arr[start] <= arr[start+1]){
        //      return checksorted(arr,start+1);
        // }else{
        //     return false;
        // }

         if(arr[start] >arr[start+1]){
            return false;
        }

        return checksorted(arr,start+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(checksorted(arr,0));
    }
}
