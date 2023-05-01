package class13HW;

public class HW13StringSwapper {
    //How would you swap 2 strings without a temporary variable?
            public static void main(String[] args) {
            String str1 = "Hello";
            String str2 = "World";

            str1 = str1.concat(str2);
            str2 = str1.substring(0, str1.length() - str2.length());
            str1 = str1.substring(str2.length());

            System.out.println("Swapped strings:");
            System.out.println("str1: " + str1);
            System.out.println("str2: " + str2);
        }
    }


