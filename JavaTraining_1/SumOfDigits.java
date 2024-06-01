//Sum of 2 digits of a number
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two digit number:");
        int num = sc .nextInt();
        int fdig = num%10;
        int sdig = num/10;
        System.out.println(fdig);
        int res = fdig + sdig ;
        System.out.println(sdig);
        System.out.println("Result :"+res); 
        sc.close();
    }
}
