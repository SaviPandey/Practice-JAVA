//Sum of 4 digits of a number
import java.util.*;
public class SumOfFour {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 4 digit number");
        int num = sc.nextInt();
        int n1 = num% 10;
        int n2= num/10; 
        int n3 = n2%10;
        int n4 = n2/10;
        int n5 = n4%10;
        int n6 = num/1000;
        int sum = n1 + n3+ n5 + n6;
        System.out.println(sum);
        sc.close();
    }
}
