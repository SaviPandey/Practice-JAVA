import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=1 ; i<=num ; i++){
            fact = fact* i;
        }
        System.out.println("Factorial is :"+fact);
        sc.close();
    }
}
