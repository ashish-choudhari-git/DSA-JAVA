import java.util.Scanner;

public class DecimalToBinary {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        long binary = 0;
        int pow=0;

        while(decimal>0){
            int remainder = decimal%2;
            binary += (long)remainder * (long)Math.pow(10,pow);
            pow++;
            decimal = decimal/2;
        }

        System.out.println(binary);
        sc.close(); 
     }
}
