public class StaticPrac8 {
    {
        System.out.println("I am in Non Static block");
    }
    static{
        System.out.println("I am in static block");
    }
    public static void main(String[] args) {
        StaticPrac8 s = new StaticPrac8();
        System.out.println("I am in Main");
    }

}
