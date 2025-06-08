class Palindrome {
    public static boolean isPalindrome(String s) {
        int front = 0;
        int back = s.length() - 1;

        while (front <= back) {
            if (!Character.isLetterOrDigit(s.charAt(front))) {
                front++;
                continue; 
            }
            if (!Character.isLetterOrDigit(s.charAt(back))) {
                back--;
                continue; 
            }
            if (Character.toLowerCase(s.charAt(front)) != Character.toLowerCase(s.charAt(back))) {
                return false;
            }

            front++;
            back--;
        }

        return true;
    }
    public static void main(String[] args) {
        String s ="ashish, you;;; uoy ,,hsihsa ";
        System.out.println(isPalindrome(s));
    }

}
/* t-O(n) */