public class StaticPrac6 {
    static{
        System.out.println("I am in static block1");
    }
    static{
        System.out.println("I am in static block2");
    }
    public static void main(String[] args) {
        System.err.println("I am in main");
    }
    static{
        System.out.println("I am in static block 3");
    }
}
