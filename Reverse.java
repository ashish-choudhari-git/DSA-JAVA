/*
Mehtod 1:
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2,4, 4, 6};
        for(int i = 0; i < arr.length / 2; i++) {
            // Swap elements at indices i and arr.length - 1 - i
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
*/
/*
Mehtod 2:
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2,4, 4, 6};
        int left =0;
        int right = arr.length - 1;
        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            // Move towards the middle
            left++;
            right--;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
*/


/*
Method 3:naive approacch->
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int[] temp = new int[arr.length];   

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - 1 - i]; 
        }

        System.out.println("Reversed Array: " + Arrays.toString(temp));
    }
}
    */

/* 
Method-4:
import java.util.*;
public class Reverse {
        public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.reverse(list);  
        System.out.println("Reversed List: " + list);
    }
}
 */