import java.util.Scanner;
public class MulWOSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int i = 1;
        int mul = 0;

        while (i <= n2) {
            mul += n1;
            i++;
        }

        System.out.println("The multiplication is: " + mul);

        sc.close();
    }
}
