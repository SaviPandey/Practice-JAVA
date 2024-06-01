interface I1{
    void m1();
    default void m2(){
        System.out.println("Default method");
    }
    static void m3(){
        System.out.println("Static method");
    }
}

public class InterfacePrac5 implements I1{
    public void m1(){
        System.out.println("Abtract method");
    }
    public static void main(String[] args) {
        InterfacePrac5 i = new InterfacePrac5();
        i.m1();
        i.m2();
        I1.m3();
    }
}
