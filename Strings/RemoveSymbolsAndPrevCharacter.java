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
