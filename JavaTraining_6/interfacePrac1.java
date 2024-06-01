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
class interfacePrac1{
    public static void main(String[] args) {
        Abc obj = new Abc();
        obj.show1() ;
        obj.show2();
    }
}