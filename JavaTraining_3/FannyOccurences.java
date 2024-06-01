import java.util.*;
public class FannyOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);
        String new_string = "";

        for(int i =0 ; i<str.length() ; i++){
            if( str.charAt(i) == ch){
                continue;
            }
            else{
                new_string += str.charAt(i);
            }
        }
        System.out.print("Updated String after removing character :  "+new_string);
        sc.close();
    }
}
