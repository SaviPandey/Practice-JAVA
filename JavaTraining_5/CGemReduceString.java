import java.util.*;

public class CGemReduceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");

        String st = sc.next();
        int count =1;
        String res = "";
        for(int i=0; i<st.length() ; i++){
            char curr = st.charAt(i) ;
            count =1;

            for(int j =i+1; j<st.length() ; j++){

                if(curr ==(st.charAt(j))){
                    count +=1;
                }
                else{
                    break;
                }
                i=j;

            }
            if(count == 1){
                res += st.charAt(i);
            } 
            else{
                res = res +st.charAt(i)+count;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
