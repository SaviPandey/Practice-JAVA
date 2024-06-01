import java.util.*;

public class FirstBadVersion {
    static int bad;
    public static boolean isBadVersion(int n){
        if(n<bad){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of version : ");
        int n= sc.nextInt();
        System.out.print("Enter first bad version : ");
        bad = sc.nextInt();
        
        for(int i=1 ; i<=n ; i++){
            System.out.println("The "+i+"th"+" version is bad : "+isBadVersion(i));
        }
        // System.out.print("Output : "+isBadVersion(n));
        sc.close();
    }
}
