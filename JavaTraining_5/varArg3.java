public class varArg3 {
    void m1(int... n){
        System.out.println("Variable argument "+n);
    }
    void m1(int n){
        System.out.println("Normal argument "+n);
    }
    public static void main(String[] args) {
        varArg3 obj = new varArg3();
        obj.m1(10);
    }
}
