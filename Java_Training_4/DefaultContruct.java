import java.util.*;
class Triangle{
    public Triangle(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        int peri= a+ b+c;
        System.out.println("Perimeter will be : "+peri);
        int s = (a + b+ c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is : "+area);
    }

}
public class DefaultContruct {
    public static void main(String[] args) {
        Triangle t = new Triangle();
    }
}
