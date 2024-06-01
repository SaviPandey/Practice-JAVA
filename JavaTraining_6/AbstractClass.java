abstract class Test{
    abstract void m1();
    abstract void m2();
    abstract void m3();
    void m4(){
        System.out.println("M4 non-abstract method");
    }
}
public class AbstractClass  extends Test{
    public void m1(){
        System.out.println("m1 method");
    }
    public void m2(){
        System.out.println("m2 method");
    }
    public void m3(){
        System.out.println("m3 method");
    }
    public static void main(String[] args) {
        AbstractClass a = new AbstractClass();
        a.m1(); a.m2();
        a.m3(); a.m4();

        Test t1 = new AbstractClass(); //abstract class reference variable Child class object
        t1.m1(); t1.m2();
        t1.m3(); t1.m4();
    }

}
