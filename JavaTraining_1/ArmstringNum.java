import java.util.*;
public class ArmstringNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enyter a number :");
        int num = sc.nextInt();
        int rem = 0;
        int copyNum = num;
        int sum =0;
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
