import java.util.*;
public class ArmstrongForAny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int copyNum = num;
        int count = 0;
        int i =0;
        int rem =0;
        int sum =0;

        while(num>0){
            num = num /10 ;
            i++;
        }
        while(num>0){
            rem = num%10;
            sum = sum + (rem*rem*rem);
            num = num/10;
        }
        if(sum==copyNum){
            System.out.println("It is a armstrong number .");
        }
        else{
            System.out.println("Not a armstrong number!");
        }
        sc.close();
    }
}
