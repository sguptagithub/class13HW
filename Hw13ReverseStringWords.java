package class13HW;

public class Hw13ReverseStringWords {
   /*How would you reverse a String word by word? for example
     input=>This is sentence i want to reverse
    output=>sihT si ecnetnes i tnaw ot esrever*/
        public static void main(String[] args) {

            String input = "This is sentence i want to reverse";

            String[] words = input.split(" ");

            for (int i = 0; i < words.length; i++) {
                words[i] = reverseWord(words[i]);
            }

            String output = String.join(" ", words);

            System.out.println(output);
        }
               private static String reverseWord(String word) {
            StringBuilder reversed = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed.append(word.charAt(i));
            }
            return reversed.toString();
        }
    }


