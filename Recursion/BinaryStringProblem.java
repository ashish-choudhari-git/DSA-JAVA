/*
Binary Strings Problem
Print all binary strings of size N without consecutive ones.
 */

public class BinaryStringProblem {
    static void printBinaryString(int n, int lastplace , StringBuilder str){
        //base
        if(n==0){
            System.out.println(str.toString());
            return;
        }

        //kaam
        printBinaryString(n-1, 0, str.append("0"));
        str.deleteCharAt(str.length() -1);

        if(lastplace == 0){
            printBinaryString(n-1, 1, str.append("1"));
            str.deleteCharAt(str.length() -1);
        }

        // if(lastplace ==0){
        //     printBinaryString(n-1, 1, str.append("1"));
        //     str.deleteCharAt(str.length() -1);
        //     printBinaryString(n-1, 0, str.append("0"));
        //     str.deleteCharAt(str.length() -1);
        // }else{
        //     printBinaryString(n-1, 0, str.append("0"));
        //     str.deleteCharAt(str.length() -1);
        // }
    }

    public static void main(String[] args) {
        printBinaryString(3,0, new StringBuilder(""));
    }
}
