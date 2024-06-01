//Sum of 3 digits of a number
import java.util.*;
public class SumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three digit number:");
        int num = sc .nextInt();
        int n1 = num%10;
        int n2 = num/10;
        int n3 = n2%10;
        int n4 = n2/10;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        int res = n1+n4+n3;
        System.out.println("Result :"+res); 
        sc.close();
    }
}
