public class Anagram {
    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26]; //ASCII valeu will be stored

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;   //go to any index between 0 to 25 increment count by one
            count[t.charAt(i) - 'a']--; //go to any index between 0 to 25 dec count by one
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String origin = "ashish" ;
        String check = "ishash";
        boolean res = isAnagram(origin, check);
        System.out.println(res);
    }

}
