class Parent{
    int cash , gold;
    public void properties(){
        System.out.println("Properties");
    }
    public void bike(){
        System.out.println("Splender+");
    }
}
class Child extends Parent{
    public void bike(){
        System.out.println("Ferrari");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        Child c = new Child();
        c.properties();
        c.bike();
    }
}
