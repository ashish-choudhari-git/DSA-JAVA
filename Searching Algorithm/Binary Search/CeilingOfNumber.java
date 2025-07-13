/* ceiling of number that is  equal or just greater than target number in array*/

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr ={23,66,88,99,111};
        int left = 0;
        int right = arr.length - 1;
        int target = 212;
        int result =-1 ;

         if (target > arr[right]) {
            System.out.println("Ceiling does not exist");
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
            result =left;
        }

        
       System.out.println(arr[result]);
    }
}
