import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int i = 1;

        System.out.print(a + "," + b + ",");

        while (i <= num - 2) {
            int c = a + b;
            System.out.print(c + ",");
            a = b;
            b = c;
            i++;
        }

        sc.close();
    }
}
