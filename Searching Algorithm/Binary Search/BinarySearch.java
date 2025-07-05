/* time complexity : O(1) in best case, O(log n) in worst 
 * space complexity : O(1) in iterative, O(log n) in recursion
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        // System.out.println(bs(arr,6,0,arr.length-1));
        int left = 0;
        int right = arr.length - 1;
        int target = 9;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                break;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

       System.out.println(result);
    }

    
    /*
     static int bs(int[] arr ,int target, int left , int right){
        if(arr.length==0){
            return -1;
        }
        if (left > right) {
        return -1;
    }
        int mid = left + (right-left)/2;
        if(arr[mid]==target) return mid;
        if(arr[mid]>target){
            return bs(arr,target,left,mid-1);
        }else{
             return bs(arr,target,mid+1,right);
        }
    }

     */
    
    
}
