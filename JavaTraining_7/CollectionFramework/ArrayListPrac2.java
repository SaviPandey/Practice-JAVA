package CollectionFramework;
import java.util.*;
public class ArrayListPrac2 {
    public static void main(String[] args) {
        ArrayList<String> color_list = new ArrayList<>(3);
        color_list.add("White");
        color_list.add("Black");
        color_list.add("Red");
        color_list.add("White");

        System.out.println("********** Print COlor List *********");
        for(int i =0 ;i<4; i++){
            System.out.println(color_list.get(i).toString()+ " ");
        }
        ArrayList<String> sample = new ArrayList<>(3) ;
        sample.add("Savinay");
        sample.add("Pandey");
        sample.add("Harsh");

        color_list.addAll(sample);
        for(int i=0; i<7; i++){
            System.out.println(color_list.get(i)+" ");
        }
    }
}
