import java.util.Stack;

// ex : Leet@@code Output : lecode
// Time complexity : O(N) space complexity: O(N)
public class RemoveSymbolsAndPrevCharacter {
     static public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
        // for (char ch : s.toCharArray()) {
        //     if (ch == '*') {
        //         if (!stack.isEmpty()) {
        //             stack.pop();
        //         }
        //     } else {
        //         stack.push(ch);
        //     }
        // }

        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String in = "Ashiish@@&&hola";
        System.out.println(removeStars(in));
    }

}

// for removing next letter 
// while (i < s.length()) {
//             char ch = s.charAt(i);

//             if (ch == '*') {
//                 // Push the star, we’ll handle it on the next character
//                 stack.push(ch);
//                 i++;
//             } else {
//                 // If top of the stack is '*', remove the '*' and skip this char
//                 if (!stack.isEmpty() && stack.peek() == '*') {
//                             stack.pop();  // remove '*'
//                             i++;          // skip current char afte *
//                         } else {
//                             stack.push(ch);
//                             i++;
//                         }
//                   }
//         }
