package class13HW;

import java.util.Scanner;

public class UserNamePW {
          public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            System.out.print("Confirm password: ");
            String confirmPassword = scanner.nextLine();

            if (username.isEmpty() || password.isEmpty()) {
                System.out.println("Username or password cannot be empty");
            } else if (password.length() < 8) {
                System.out.println("Password is too short");
            } else if (password.contains(username)) {
                System.out.println("Password cannot contain username");
            } else if (!password.equals(confirmPassword)) {
                System.out.println("Passwords do not match");
            } else {
                System.out.println("Your username and password has been created");
            }
        }
    }


