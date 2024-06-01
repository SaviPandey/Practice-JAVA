import java.util.*;
public class ArmstrongNumber2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem = 0;
        // int copyNum = num;
        int sum =0;
        int count = 0;
        for(int i=1 ; i<=5000 ; i++){
            int j =i;
            count =0;
            while(j>0){
                j = j/10 ;
                count++;
            }
            while(i>0){
                rem = i%10;
                sum = sum + (int)Math.pow(rem , count);
                i = i/10;
            }

        if(sum==i){
            System.out.println("It is a armstrong number .");
        }
        else{
            System.out.println("Not a armstrong number!");
        }
    }
        sc.close();
    }
}
