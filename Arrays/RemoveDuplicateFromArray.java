public class RemoveDuplicateFromArray {
  
    static int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;

    int i = 0;

    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }

    return i + 1;
}

public static void main(String[] args) {
    int[] arr = {1,2,2,2,2,2,4,5};
    System.out.println(removeDuplicates(arr));

    for(int i=0; i< arr.length ; i++){
        System.out.print(arr[i]+" ");
    }
}
}


