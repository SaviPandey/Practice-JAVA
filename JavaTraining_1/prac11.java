import java.util.*;
public class prac11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        int res = num%10;
        
        System.out.println("Result: "+res);
        sc.close();

    }
}
