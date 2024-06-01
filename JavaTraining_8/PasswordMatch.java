import java.util.*;

public class PasswordMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userNames = {"savinay123", "pratik123", "krithik123", "gautam123", "topibaaz"};
        String[] passwords = {"12345", "45677", "12345", "09876", "45678"};

        // System.out.println("Enter 3 user names and passwords:");

        // for (int i = 0; i < 3; i++) {
        //     System.out.print("User name " + (i + 1) + ": ");
        //     userNames[i] = scanner.nextLine();
        //     System.out.print("Password " + (i + 1) + ": ");
        //     passwords[i] = scanner.nextLine();
        // }

        System.out.print("Enter your user name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < 5; i++) {
            if (userNames[i].equals(userName) && passwords[i].equals(password)) {
                System.out.println("Login successful!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Login unsuccessful.");
        }

        scanner.close();
    }
}
