interface I1{
    void m1();
    interface I2{
        void m2();
    }
}
public class InterfacePrac4 implements I1 , I1.I2 {
    public void m1(){
        System.out.println("M1 method");
    }
    public void m2(){
        System.out.println("M2 method");
    }
    public static void main(String[] args) {
        InterfacePrac4 t = new InterfacePrac4();
        t.m1();
        t.m2();
    }
}
