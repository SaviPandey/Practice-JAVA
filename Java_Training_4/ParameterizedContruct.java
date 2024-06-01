class Rectangle{
    int area;
    public Rectangle(int a , int b){
        area = 2*(a*b);
        // System.out.println("Area = "+area);
    }
    public int area(){
        return area;
    }
}
public class ParameterizedContruct {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4 ,5);
        Rectangle r2 = new Rectangle(5 ,8);
        System.out.println(r1.area());
        System.out.println(r2.area());
        // r2.area();
    }
}
