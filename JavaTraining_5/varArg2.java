public class varArg2 {
    void m1(char ch , int... n){
        System.out.print(ch);
        for(int a1 : n ){
            System.out.print(" "+a1);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        varArg2 obj = new varArg2();
        obj.m1('A');
        obj.m1('A',10 );
        obj.m1('B',10,20);
        obj.m1('C',10,20,30);
    }
}
