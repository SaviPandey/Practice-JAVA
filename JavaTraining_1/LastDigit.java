//Find last digit of a number
import java.util.Scanner;
class LastDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int last = a % 10;
        System.out.println(last);
        sc.close();
    }
}
