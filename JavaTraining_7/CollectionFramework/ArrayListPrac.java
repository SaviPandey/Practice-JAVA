package CollectionFramework;
import java.util.*;
public class ArrayListPrac {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add("R");
        a1.add(120);
        a1.add("R");
        a1.add(null);
        System.out.println(a1);
        a1.remove(2);
        System.out.println(a1);
        a1.add(2, "M");
        a1.add("N");
        System.out.println(a1);
        a1.removeAll(a1);
        System.out.print(a1);
        // a1.add(3,"C"); //java.lang.IndexOutOfBoundException :index 3
        System.out.println(a1);
    }
}
