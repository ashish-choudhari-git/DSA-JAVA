/*Leetcode : 43. Multiply Strings

Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
 
Example 1:
Input: num1 = "2", num2 = "3"
Output: "6"

Example 2:
Input: num1 = "123", num2 = "456"
Output: "56088" */


public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        
        //this code works well , just overflow problem , that's why I written second code.
        
        /*
        StringBuilder ans=new StringBuilder();

        //brute force --------------------------- '2'-'0'=2(integer)
        if(num1.equals("0") ||num2.equals("0")){
            return "0";
        }

        int result =0;
        long total=0;
        int carry=0;
        int place = 1;

        for (int i = num1.length() - 1; i >= 0; i--) {
            result = 0;
            carry = 0;
            int innerPlace = 1;

            for (int j = num2.length() - 1; j >= 0; j--) {
                int first = num1.charAt(i) - '0';
                int second = num2.charAt(j) - '0';

                int prod = first * second + carry;
                carry = prod / 10;
                int digit = prod % 10;

                result += digit * innerPlace;
                innerPlace *= 10;
            }

            if (carry > 0) {
                result += carry * innerPlace;
            }

            total += result * place;
            place *= 10;
        }

        return String.valueOf(total);

        */
        if(num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        String total = "0";
        int place = 0;

        for (int i = num1.length() - 1; i >= 0; i--) {
            int carry = 0;
            int first = num1.charAt(i) - '0';
            StringBuilder result = new StringBuilder();

            for (int j = num2.length() - 1; j >= 0; j--) {
                int second = num2.charAt(j) - '0';
                int prod = first * second + carry;
                carry = prod / 10;
                int digit = prod % 10;
                result.insert(0, digit); 
            }

            if (carry > 0) {
                result.insert(0, carry);
            }

            for (int k = 0; k < place; k++) {
                result.append('0');
            }

            total = addStrings(total, result.toString());
            place++;
        }

        return total;
        
    }

    static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1, j = num2.length() - 1;

        while(i >= 0 || j >= 0 || carry > 0) {
            int d1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int d2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;
            int sum = d1 + d2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;
        }

        return sb.reverse().toString();
    }
}
