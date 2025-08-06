/*
Leetcode :  3136. Valid Word

A word is considered valid if:
It contains a minimum of 3 characters.
It contains only digits (0-9), and English letters (uppercase and lowercase).
It includes at least one vowel.
It includes at least one consonant.
You are given a string word.
Return true if word is valid, otherwise, return false.
Notes:
'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
A consonant is an English letter that is not a vowel.
 
Example 1:
Input: word = "234Adas"
Output: true
Explanation: This word satisfies the conditions.

Example 2:
Input: word = "b3"
Output: false
Explanation: The length of this word is fewer than 3, and does not have a vowel.

Example 3:
Input: word = "a3$e"
Output: false
Explanation: This word contains a '$' character and does not have a consonant.
 */


public class ValidWord {
    public boolean isValid(String word) {
        if(word.length() < 3){
            return false;
        }
        
        boolean hasVowel = false;
        boolean hasConsonant = false;
        boolean hasSymbols = false;

        for (char ch : word.toCharArray()) {
            
            if (isVowel(ch)) {
                hasVowel = true;
            } else if (Character.isLetter(ch)) {
                hasConsonant = true;
            }
            if (!Character.isLetterOrDigit(ch)){
                hasSymbols = true;
            }
        }

        if (hasVowel == true && hasConsonant == true && hasSymbols ==false) {
            return true;
        } else {
            return false;
        }

    }

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
