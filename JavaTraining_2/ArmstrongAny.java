import java.util.Scanner;
public class ArmstrongAny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int num_copy = num;
        int sum = 0;
        int count = 0;

        while (num != 0) {
            count++;
            num /= 10;
        }
        num = num_copy;

        while (num != 0) {
            int rem = num % 10;
            sum += Math.pow(rem, count);
            num /= 10;
        }

        if (num_copy == sum) {
            System.out.println("The number " + num_copy + " is an armstrong number");
        }
        else {
            System.out.println("The number " + num_copy + " is not an armstrong number");
        }

        sc.close();
    }
}
