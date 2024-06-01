import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int num_copy = num;
        int reversed = 0;

        while (num != 0) {
            int rem = num % 10;
            reversed = (reversed * 10) + rem;
            num /= 10;
        }

        if (num_copy == reversed) {
            System.out.println("The number is palindrome");
        }
        else {
            System.out.println("The number is not palindrome");
        }

        sc.close();
    }
}
