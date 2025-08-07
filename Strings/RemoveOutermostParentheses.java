/*Leetcode : 1021. Remove Outermost Parentheses

A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.
For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.
Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.

Example 1:
Input: s = "(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

Example 2:
Input: s = "(()())(())(()(()))"
Output: "()()()()(())"
Explanation: 
The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".

Example 3:
Input: s = "()()"
Output: ""
Explanation: 
The input string is "()()", with primitive decomposition "()" + "()".
After removing outer parentheses of each part, this is "" + "" = "". */


public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        int start=0;
        int end = s.length()-1;
        StringBuilder ans = new StringBuilder("");
        int outer=0;

        //we want outermost parentheses to be skipped, so we will make outher =0 , if outer is 0 than it should be skip. if outer is greater than 0 means it is under some parentheses so ,append it, and when closing arrives , decreasing outer varibale so we can identify outermost parentheses

        while(start<=end){
            if(s.charAt(start)=='('){
                if(outer>0){
                    ans.append('(');
                }
                outer++;
            }else{
                outer--;
                if (outer > 0) {
                    ans.append(')');
                }
            }

            start++;
        }

        return ans.toString();
    }
}
