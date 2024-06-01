import java.util.*;
public class StringProb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char ch[] = s.toCharArray();
        // System.out.println(ch.toString());
        String reverse = "";
        for(int i = ch.length-1 ; i>=0 ;i--){
            reverse += ch[i];
        }
        System.out.println("Reverse is "+ reverse);
        sc.close();
    }
}
