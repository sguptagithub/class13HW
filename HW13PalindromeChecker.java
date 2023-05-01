package class13HW;

public class HW13PalindromeChecker {
        //How would you check if String is palindrome or not? aba=> true Abbc =>false
        public static void main(String[] args) {
             String input = "aba";
            input = input.toLowerCase();
            input = input.replaceAll("[^a-z]", "");
            boolean isPalindrome = input.equals(reverseString(input));
            if (isPalindrome) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }
        }
        private static String reverseString(String str) {
            StringBuilder reversed = new StringBuilder(str);
            return reversed.reverse().toString();
        }
    }

