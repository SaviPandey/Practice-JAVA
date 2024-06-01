public class StaticPrac9 {
    public static void show(){
        System.out.println("Non static show");
    }
    {
        show();
    }
    static{
        System.out.println("I am in static block ");
    }
    public static void main(String[] args) {
        StaticPrac9 s = new StaticPrac9();
        System.out.println("I am in Main");
    }
}
