import java.util.*;
class ReduceString2 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = s.next();
        int j,i=0,c=1;
        String res ="";
        while(i<str.length()){

            for(j=i+1;j<str.length();j++){
                if(str.charAt(j-1)==str.charAt(j)){
                    c=c+1;
                }
                else{
                    break;
                }
            }
                
            if(c==1){
                res = res + str.charAt(j-1);
            }
            else{
                res = res + str.charAt(j-1) + c;
            }
            i=j;
            c=1;
        }
        System.out.println(res);
    }
}
