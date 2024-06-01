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
class C extends A{
    public void showC(){
        System.out.println("I am in class C");
    }
}
public class hierarchicalInheritance {
    public static void main(String[] args) {
        B obj1 =new B();
        obj1.showA();
        obj1.showB();
        C obj2 = new C();
        obj2.showA();
        obj2.showC(); 
    }
}
