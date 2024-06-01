import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three digit number: ");
        int num = sc.nextInt();
        int sum = 0;
        int num_copy = num;

        while (num != 0) {
            int rem = num % 10;
            sum += (rem * rem * rem);
            num /= 10;
        }

        if (sum == num_copy) {
            System.out.println("The number is armstrong");
        }
        else {
            System.out.println("The number is not armstrong");
        }

        sc.close();
    }
}
