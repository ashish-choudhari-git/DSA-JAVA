// Find count of even number of digit in array
public class EvenDigitCountInArray {
    public static void main(String[] args) {
        int[] arr ={12,44,55,66,324};
        int count = findNumbers(arr);
        System.out.println("Given array contain "+ count+ " even number of digits" );
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        
        for (int num : nums) {
            int digits = 0;

            if(num <0 ){
            num = num *-1;
            }

            // if(num ==0){
            //     digits =1;
            // }

            // while (num > 0) {
            //     num /= 10;
            //     digits++;
            // }
            digits = (int)Math.log10(num) -1;
             
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
