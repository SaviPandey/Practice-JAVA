import java.util.*;
class InvalidAgeException extends Exception{
    public InvalidAgeException(){
        System.out.println("Not eligible for marriage try again after some years.");
    }
}


public class ExceptionPrac4 {
    static void status(int age) throws InvalidAgeException{
        if(age>18){
            System.out.println("Eligible for Marriage!");
        }
        else{
            throw new InvalidAgeException();
        }
    }
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        ExceptionPrac4.status(age);
        sc.close();
    }
}
