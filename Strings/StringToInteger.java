/* Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

The algorithm for myAtoi(string s) is as follows:

--Whitespace: Ignore any leading whitespace (" ").
--Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
--Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
--Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
--Return the integer as the final result.
 */


public class StringToInteger {
    static int myAtoi(String s) {
        int i=0;
        int n = s.length();
        int sign =1;
        int result =0;// because it has give ,if no digit found then 0.

        //ignore leading space
        while(i<n && s.charAt(i)==' '){
            i++;
        }

        //determine signedness
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++; // move past the sign
        }

        
        //skip leading zeros
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i++)-'0'; //because s.charAt will give ASCII value , when we do operation with char, int dominate EX: '4'-'0'= 52-48 =4  

            //if result exceeds int data type limit , round off to int boundaries and return them, Controlling overflow
            if (result > (Integer.MAX_VALUE - digit) / 10){
                return sign ==-1? Integer.MIN_VALUE : Integer.MAX_VALUE;
            //max-digit because we are checking if we add previous result with digit ,it should ne less than max, and /10-> we are about to multiply by 10
            }

            result = result *10 + digit; // result =0 then 0*10+4=4 then 4*10+2=42, we can add integer at end. 
        }

        return result*sign;
    }

    public static void main(String[] args) {
        String str = "1337c0d3";
        System.out.println(myAtoi(str));
    }
}
