// import java.util.*;
public class ExceptionPrac1{
    public static void main(String[] args) {
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]); // args[2] then ArrayIndexOutOfBoundsException.
            int c = a/b;
            System.out.println("Result: "+ (a+b+c));
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Result :" + (5+6));
        }
        catch(NumberFormatException fe){
            System.out.println("Result :"+(8+14));
        }
        catch(ArithmeticException ar){
            System.out.println("Result :" +(11+22));
        }
    }
}