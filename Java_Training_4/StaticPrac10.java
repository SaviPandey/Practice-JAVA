public class StaticPrac10 {
    public void show(){
        System.out.println("Non static show.");
    }
    public static void show1(){
        System.out.println("Static show1");
    }
    {
        show();
    }
    static{
        show1();
    }
    public static void main(String[] args) {
        StaticPrac10 s= new StaticPrac10();
        System.out.println("I am in Main");
    }
}
