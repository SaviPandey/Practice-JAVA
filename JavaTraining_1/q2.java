import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumNumbers(n));
        sc.close();
    }
    public static int sumNumbers(int n){
        int sum = 0 ;
        for(int i = 1 ; i<= n ; i++){
            sum += i ;
        }
        return sum;
    }
}
