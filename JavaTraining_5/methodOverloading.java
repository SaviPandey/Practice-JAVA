public class methodOverloading {
    public void add(int a){
        System.out.println(a+a);
    }
    public void add(int a , int b){
        System.out.println(a+b);
    }
    public void add(int a, int b , int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        methodOverloading m = new methodOverloading();
        m.add(5);
        m.add(5 ,6);
        m.add(5 , 7, 6);
    }
}
