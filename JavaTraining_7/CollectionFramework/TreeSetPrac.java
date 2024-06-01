package CollectionFramework;
//TreeSet DEmo
import java.util.*;
public class TreeSetPrac {
    public static void main(String[] args) {
        TreeSet t =  new TreeSet();
        t.add("A");
        t.add("Z");
        t.add("B");
        t.add("C");
        t.add("D");
        //t.add(10) ; ClassCastException
        //t.add(null); NullPointerException
        System.out.println(t);
        
    }
}
