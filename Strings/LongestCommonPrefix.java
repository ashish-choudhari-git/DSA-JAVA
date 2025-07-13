/*
 14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".

Time complexity : O(N*M) n = number of strings in the array, m = length of the shortest string  and Space complexity : O(1)
 */

public class LongestCommonPrefix {
     static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        String prefix = strs[0];

        for( int i =1; i< strs.length;i++){
        //we will check if first string is equal start of next string (prefix), if not ,then we cut prefix string last letter, and again check , this we keep till letters matches. if it doesn't match ,then it always ""
            while(!strs[i].startsWith(prefix)){

                prefix = prefix.substring(0, prefix.length() -1);

                if(prefix.length() ==0){
                    return "";
                }

            }
        }

        return prefix;

        
        
    }
    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(input));
    }
}
