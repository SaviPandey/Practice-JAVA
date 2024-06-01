import java.util.*;
public class AdmissionGrant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 paper marks:");
        int n1 = sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        System.out.println("Enter Gender:(M/F)");
        char G =sc.next().charAt(0);
        double sum = n1+n2+n3;
        double percent = (sum/300)*100;
        System.out.println("Percentage:"+percent);
        if(percent>=80 && G=='F'){
            System.out.println("You can take Admission");
        }
        else if(percent>=60 && G == 'M'){
            System.out.println("Admission Granted");
        }
        else
        {
            System.out.println("You can't take admission");
        }
        sc.close();
    }
}
