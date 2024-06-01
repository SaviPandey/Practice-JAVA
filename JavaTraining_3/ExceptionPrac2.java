//pass exception as method parameter
// import java.io.*;   JAroorat nhi hai bc
import java.io.IOException;

public class ExceptionPrac2 {
    void method1(ArithmeticException ae){
        System.out.println(ae);
    }
    void method1(IOException ae){
        System.out.println(ae);
    }
    public static void main(String[] args) {
        ExceptionPrac2 e = new ExceptionPrac2();
        e.method1(new ArithmeticException());
        e.method1(new IOException());

    }
}
