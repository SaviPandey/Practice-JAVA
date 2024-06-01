import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int num2 =  num;
        int fact = 1;

        while (num != 0) {
            fact *= num;
            num -= 1;
        }

        System.out.println("The factorial of the number " + num2 + " is: " + fact);

        sc.close();
    }
}
