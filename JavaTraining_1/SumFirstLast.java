//Sum of First and last digits
import java.util.*;
public class SumFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 digit number:");
        int num = sc.nextInt();
        int n1 = num%10;
        int n2 = num/10000;
        int res = n1+n2;
        System.out.println("Result:"+res);
        sc.close();
        
    }
}
