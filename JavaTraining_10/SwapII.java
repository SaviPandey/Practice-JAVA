import java.util.*;

public class SwapII{
   static String StringChallenge(String str){
       String S = "";
       int c = 0, p1 = 0;
       for(int i = 0; i < str.length(); i++){
           char ch = str.charAt(i);
           if(ch >= 97 && ch <= 122){
               S = S + Character.toUpperCase(ch);
           }else if(ch >= 65 && ch <= 90) {
               S = S + Character.toLowerCase(ch);
           }else if(ch >= 48 && ch <= 57) {
               c++;
               if(c < 2){
                   p1 = i;
                   S = S + ch;
               }else{
                   S = S + S.charAt(p1);
                   S = S.substring(0, p1) + ch + S.substring(p1 + 1);
               }
           }else {
               S = S + ch;
           }
       }
       return S;
   }
   public static void main(String args[])
   {
       Scanner Sc = new Scanner(System.in);
       System.out.print("Enter a string : ");
       String S = Sc.nextLine();
       String[] Str = S.split(" ");
       System.out.print("New string : ");
       for(int i = 0; i < Str.length; i++)
       {
           System.out.print(StringChallenge(Str[i]) + " ");
       }
   }
}