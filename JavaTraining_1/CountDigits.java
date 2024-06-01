import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        int i=0;
        while(num>0){
        num = num /10 ;
        i++;
        }
        System.out.println("Number  of DIgits :"+i);
        sc.close();
    }
}
