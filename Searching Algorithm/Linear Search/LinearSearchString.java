// return character index, and also return word position in sentence
public class LinearSearchString {
   public static void main(String[] args) {
      // String str = "Ashish";
      String str2 = "Ashish choudhari will reach great heights";
      // char target = 'i';
      String target2 = "choudhari";
      // int result = search(str, target);
      String[] words = str2.split(" ");
      int result = search2(words, target2);
      if (result == -1) {
         // System.out.println("character not found in the string.");
         System.out.println("Word not found in the Sentence.");
      } else {
         // System.out.println("character is found at index " + result);
         System.out.println("Word is at position " + (result + 1));
      }
   }

   static int search2(String[] words, String target2) {
      if (words.length == 0) {
         return -1;
      } else {
         for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target2)) {
               return i;
            }
         }

         return -1;
      }

   }

   static int search(String str, char target) {
      if (str.length() == 0) {
         return -1;
      } else {
         for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
               return i;
            }
         }

         return -1;
      }

   }
}
