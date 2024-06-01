class A{
    public void showA(){
        System.out.println("I am in class A");
    }
}
class B extends A{
    public void showB(){
        System.out.println("I am in class B");
    }
}
class C extends B{
    public void showC(){
        System.out.println("I am in class C");
    }
}
public class multiLevelInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.showA();
        obj.showB();
        C obj2 = new C();
        obj2.showA();
        obj2.showB();
        obj2.showC();
        
    }
}
