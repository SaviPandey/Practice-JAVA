import java.util.*;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int numCopy = num;
        int rev =0;
        int rem =0;
        while(num!=0){
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.println("Reverse :"+rev);
        if(rev == numCopy){
            System.out.println("It is a pallindrome !");
        }
        else{
            System.out.println("Not a pallindrome!");
        }
        sc.close();
    }
}
