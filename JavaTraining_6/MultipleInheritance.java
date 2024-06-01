interface Abc{
    public void show();
}
class Pqr{
    static int i = 20;
}

class MultipleInheritance extends Pqr implements Abc {
    public void show(){
        System.out.println("I am in ABC");
    }
    public static void main(String[] args) {
        Abc a ;
        MultipleInheritance z = new MultipleInheritance();
        a=z;
        a.show();
        System.out.println(i);
    }
}
