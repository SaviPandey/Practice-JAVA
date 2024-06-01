import java.util.Arrays;

public class varArg1 {
    void m1(int... n){
        System.out.println(Arrays.toString(n));
    }
    public static void main(String...  args) { //Variable command line arguments
        varArg1 v = new varArg1();
        v.m1();
        v.m1(10);
        v.m1(10,20);
        v.m1(10,20,30);

    }
}
