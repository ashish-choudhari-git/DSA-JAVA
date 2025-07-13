/* What's the biggest number that is ≤ target */

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr ={23,66,88,99,111};
        int left = 0;
        int right = arr.length - 1;
        int target = 21;
        int result = -1 ;

         if (target < arr[left]) {
            System.out.println("Floor does not exist");
            return;
        }
        

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

        if(result==-1){
            result =arr[right];
        }

       System.out.println(result);
    }
}
