import java.util.*;
//User defined exception throw keyword
public class ExceptionPrac3 {
    static void checkAge(int age){
        if(age>18){
            System.out.println("Eligible for Marriage");
        }
        else{
            throw new ArithmeticException("Not Eligible for Marriage.");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        ExceptionPrac3.checkAge(age);
        sc.close();
    }
}
