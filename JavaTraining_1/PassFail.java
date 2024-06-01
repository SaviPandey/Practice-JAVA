import java.util.*;
public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 3 paper marks:");
        int n1 = sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        double sum = n1+n2+n3;
        double percent = (sum/300)*100;
        System.out.println("Percentage:"+percent);
        if(percent<45){
            System.out.println("You're Fail");
        }
        else
        {
            System.out.println("Pass");
        }
        sc.close();
    }
}
