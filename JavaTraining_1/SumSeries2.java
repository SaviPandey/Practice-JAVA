//Sum = 1 + x/1! + x^2/2! +  x^3/3!....+ x^n/n!
import java.util.*;
public class SumSeries2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as base value:");
        int x = sc.nextInt();
        System.out.print("Enter range of Series :");
        int num = sc.nextInt();
        int i = 1;
        int sum = 1;
        while(i<=num){
            int fact = 1;
            for(int j=1 ; j<=i ; j++){
            fact = fact* j;
            }
            sum += (Math.pow(x , i)/fact); 
            i++ ; 
        }
        System.out.println("Sum of series :"+sum);


        sc.close();
    }
}
