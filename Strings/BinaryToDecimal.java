import java.util.Scanner;

public class BinaryToDecimal {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String input = sc.nextLine();
    //     int decimal = 0;
    //     int n = input.length();

    //     for (int i = 0; i < n; i++) {
    //         int bit = input.charAt(n - i - 1) - '0';
    //         decimal += bit * Math.pow(2, i);
    //     }

    //     System.out.println(decimal);
    //     sc.close();
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int decimal = 0;
        int pow=0;

        while(input>0){
            int lastDigit = input%10;
            decimal += lastDigit * Math.pow(2,pow);
            pow++;
            input = input/10;
        }

        System.out.println(decimal);
        sc.close();
    }

//     int decimal = Integer.parseInt(input, 2);
//     System.out.println(decimal);
}
