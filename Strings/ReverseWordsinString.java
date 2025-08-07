/*Leetcode : 151. Reverse Words in a String

Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"

Example 2:
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

Example 3:
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string. */


public class ReverseWordsinString {
    public String reverseWords(String s) {
        // TC: O(N), SC: O(1)
        int n = s.length();
        String ans = "";
        String temp = "";
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            char ch = s.charAt(left);

            if (ch != ' ') 
            {
                temp += ch;
            } 
            else if (ch == ' ' && !temp.equals("")) 
            {       
                        if (!ans.equals("")) {//when ans variable has something
                            ans = temp + " " + ans;
                        } else {
                            ans = temp;//if first char is " " , then ans=""(nothing), if "  " ,then still ans="", so all leading spaces will be skiped;
                        }
                        temp = "";               
            }
            left++;
        }

        //for last word
        if (!temp.equals("")) {
            if (!ans.equals("")) {
                ans = temp + " " + ans;
            } 
        }

        return ans;
    }
}
