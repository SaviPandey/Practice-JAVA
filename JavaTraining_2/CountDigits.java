import java.util.Scanner;
public class CountDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int n = 0;

        while (num != 0) {
            n += 1;
            num /= 10;
        }

        System.out.println("The number of digits in the number is : " + n);

        sc.close();
    }
}