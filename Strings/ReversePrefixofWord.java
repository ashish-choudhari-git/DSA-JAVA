/*Leetcode : 2000. Reverse Prefix of Word

Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
Return the resulting string.

Example 1:
Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"

Example 2:
Input: word = "xyxzxe", ch = "z"
Output: "zxyxxe"

Example 3:
Input: word = "abcd", ch = "z"
Output: "abcd"
*/

public class ReversePrefixofWord {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if (idx == -1) return word; // this means character does not exist

        StringBuilder sb = new StringBuilder(word.substring(0, idx + 1));
        sb.reverse();
        sb.append(word.substring(idx + 1));
        return sb.toString();
    }
}
