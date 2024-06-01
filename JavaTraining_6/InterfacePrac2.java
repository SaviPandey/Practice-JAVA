interface I1{
    void show1();
    void show2();
}
class Abc implements I1{
    public void show1(){
        System.out.println("Show1 method");
    }
    public void show2(){
        System.out.println("Show2 method");
    }
}
public class InterfacePrac2 {
    public static void main(String[] args) {
        Abc obj =new Abc();
        obj.show1();
        I1 i = new Abc(); //Creating variable for the interface bcoz object of interface cant be created
        i.show1();
    }
}
