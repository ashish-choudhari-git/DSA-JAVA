public class CountSameDigit {
    public static void main(String[] args) {
        int n = 1223334444; 
        int count =0;
        while(n>0){
            int rem = n % 10; 
            if (rem == 3) {
                count++;
            }
            n /= 10; 
        }

        System.out.println("The digit 3 appears " + count + " times in the number 1223334444");
    }
}
