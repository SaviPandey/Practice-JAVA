//Edit Distance
import java.util.*;
public class StringProb2 {
    public static int minOpr(String str1 , String str2 ){
        int minOpr = 0;
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        if(str1.equals(str2)){
            return 0;
        }

        if(str1.length()> str2.length()){
            minOpr = str1.length() - str2.length();

        }

        else if(str1.length() == str2.length()){
            for(int i = 0 ; i<=ch1.length-1 ;i++){
                if(ch1[i] == ch2[i]){
                    continue;
                }
                else{
                    minOpr += 1;
                }
            }
        }

        else{
            minOpr = str2.length() - str1.length();
        }
        
        return minOpr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter String2 : ");
        String str2 = sc.nextLine();

        System.out.println(minOpr(str1 , str2));
        sc.close();

    }
}
