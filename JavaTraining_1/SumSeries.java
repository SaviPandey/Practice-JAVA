//Sum = 1 + x/1 + x^2/2 + x^3 /3 + .....x^n /n
import java.util.*;
public class SumSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of base (x) :");
        int x = sc.nextInt();
        System.out.println("Enter range :");
        int num = sc.nextInt();
        int i = 1 ;
        int sum = 1;
        while(i<=num){
            sum += (Math.pow(x , i)/i); 
            i++ ; 
        }
        System.out.println(sum);
        sc.close();
    }
}
