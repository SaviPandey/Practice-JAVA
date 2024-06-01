import java.util.*;
public class EmailRaj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] email = new String[5];
        System.out.println("Enter 5 email Id's : ");
        for(int i=0; i<email.length; i++){
            email[i] = sc.next();
        }
        for(int i =0; i<email.length; i++) {
            if(email[i].startsWith("raj")){
                System.out.print(email[i]+" ");
            }
        }
        sc.close();
}
}
