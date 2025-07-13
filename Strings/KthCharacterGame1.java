class KthCharacterGame1{
    static char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");

        while (word.length() < k) {
            word.append(nextChars(word.toString()));
        }

        return word.charAt(k - 1);
    }

    static String nextChars(String str) {
        StringBuilder next = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == 'z') {
                next.append('a');
            } else {
                next.append((char)(ch + 1));
            }
        }
        return next.toString();
    }

    public static void main(String[] args) {
        int input = 3;
        System.out.println(kthCharacter(input)); 
    }

}