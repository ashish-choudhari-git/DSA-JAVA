/*Leetcode : 32. Longest Valid Parentheses

Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.

Example 1:
Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".

Example 2:
Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".

Example 3:
Input: s = ""
Output: 0 */


import java.util.Stack;

public class LongestValidParentheses {
    static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();//there are 2 possible case ->(1. stack has 1 element and we are popping) and ( 2. there is already several elements)
                if(stack.isEmpty()){
                    stack.push(i); //again we are applying base condition because when "()) this case happens , all 3 will be invalid. so base case is i" 
                }else{
                    //this mens there are element already 
                    count = Math.max(count, i- stack.peek());// majority of case , base will be -1. first "()"" element will give 1-(-1)= 2. second combination "()" will have i=3. so 3-(-1)=4.if combination is "(())" initially then same at last i=3 and stack has -1. so result is 4 and so on...
                }
                
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "(()()";
        System.out.println(longestValidParentheses(s));
    }
}
