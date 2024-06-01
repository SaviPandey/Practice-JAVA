import java.util.*;
public class PowerOfFour {
    public static boolean checkPower(int n){
        while(n!=0){
            if(n ==1){
                return true;
            }
            if(n%4 ==0 ){
                n  /= 4;
                continue;
            }
            else{
                break;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Given Input is power of Four: "+checkPower(n));
        sc.close();
    }
}
