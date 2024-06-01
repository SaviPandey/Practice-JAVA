import java.util.*;
public class MultiplicationDIgits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        int mul = 1;
        while(num>0){
            int rem = num%10; 
            num = num/10;
            mul = mul * rem ;
        }
        System.out.println("Multiplication of Digits  :"+ mul);
        sc.close();
    }
}
