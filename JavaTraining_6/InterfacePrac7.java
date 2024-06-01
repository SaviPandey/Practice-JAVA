interface I1{
    default void m1(){
        System.out.println("I1 m1() method");
    }
}
interface I2{
    default void m1(){
        System.out.println("I2 m1() method");
    }
}
public class InterfacePrac7 implements I1 , I2 {
    public void m1(){
        System.out.println("M1 method common implementaion");
    }
    public static void main(String[] args) {
        new InterfacePrac7().m1();
    }
}
