import java.util.*;

class InvalidUsernamePasswordException extends Exception{
    public InvalidUsernamePasswordException(String str){
        System.out.println(str);
    }  
}
public class ExceptionProb1 {
    static void verify(String username , String password) throws InvalidUsernamePasswordException{
        if(username.equals("Savinay123") && password.equals("savi1234")){
            System.out.println("You are logged in successfully!");
        }
        else if(username.equals("Savinay123")){
            System.out.println("Check your password?");
        }
        else{
            throw new InvalidUsernamePasswordException("Denied access!");
        }
    }
    public static void main(String[] args) throws InvalidUsernamePasswordException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = sc.next();
        System.out.println("Enter Password: ");
        String password = sc.next();
        ExceptionProb1.verify(username , password);
        sc.close();
    }
}
 