//Reverse of 4 digit number
import java.util.Scanner;
public class ReverseOfNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a four digit number: ");
        int num = sc.nextInt();
        
        int reversed = num % 10;
        num = num / 10;
        reversed  = (reversed * 10) + (num % 10);
        num = num / 10;
        reversed  = (reversed * 10) + (num % 10);
        reversed = (reversed * 10) + (num / 10);
        System.out.println(reversed);
        sc.close();
    }
}
