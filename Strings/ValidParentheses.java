// Intuition
// Use a stack to track opening brackets and match them with their corresponding closing brackets as we encounter them.

// ApproachWhen encountering an opening bracket (, {, or [, push its corresponding closing bracket ), }, or ] onto the stack.

// When encountering a closing bracket, check if the stack is empty or if it doesn't match the top element - return false if either condition is true

// After processing all characters, return true only if the stack is empty (all brackets were properly matched)

// Complexity
// Time complexity: O(n)
// Space complexity: O(n)

import java.util.Stack;

class ValidParentheses {
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char i : s.toCharArray()){

            if(i == '('){
                stack.push(')');
            }
            else if(i == '{'){
                stack.push('}');
            }
            else if(i == '['){
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != i){
                return false;
            }
        } 

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "([()()])" ;
        boolean res = isValid(input);
        System.out.println(res);
    }
}

// public class ValidParentheses {
//     public boolean isValid(String s) {
//         char[] chars = s.toCharArray();
//         int top = -1; // simulate top of stack using an index

//         for (char c : chars) {
//             if (c == '(' || c == '{' || c == '[') {
//                 top++;
//                 chars[top] = c; // push character
//             } else {
//                 if (top == -1) return false; // stack empty
//                 char open = chars[top]; // top of "stack"
//                 if ((c == ')' && open != '(') ||
//                     (c == ']' && open != '[') ||
//                     (c == '}' && open != '{')) {
//                     return false;
//                 }
//                 top--; // pop
//             }
//         }

//         return top == -1; // stack empty means valid
//     }
// }
