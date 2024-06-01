import java.util.*;
class Rectangle{
    int area;
    public Rectangle(int a , int b){
        area = (a*b);
        // System.out.println("Area = "+area);
    }
    public int area(){
        return area;
    }
}
public class ParaContructUserInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Length : ");
        int l = sc.nextInt();
        System.out.println("Enter Breath : ");
        int b = sc.nextInt();
        Rectangle r = new Rectangle(l ,b);
        System.out.println("Area = "+r.area());
        // r2.area();
    }
}
