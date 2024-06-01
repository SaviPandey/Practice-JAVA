public class StaticPrac5 {
    static int i=10;
    public static void show(){  // convert this to static for error
        System.out.println(i);
    }
    static{
        show();
    }
    public static void main(String[] args) {
        i++;
        System.out.println(i);
    }
}
