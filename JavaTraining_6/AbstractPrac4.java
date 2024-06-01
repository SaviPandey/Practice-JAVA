abstract class Test{
    Test(){
        System.out.println("Abstract class constructor");
    }
}
public class AbstractPrac4 extends Test{
    AbstractPrac4(){
        System.out.println("Normal class constructor");
    }
    public static void main(String[] args) {
        new AbstractPrac4();
    }
}
