import java.util.*;
public class StrongNUm {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int f = 1;
        for(int i = 1; i<=n; i++){
            f = f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int copyNum =n;

        int sum=0;
        while(n !=0){

            int a = n%10;
            sum += fact(a);
            n =n/10;

        }
        if(sum == copyNum){
            System.out.println("Strong Number !");
        }
        else{
            System.out.println("Not Strong Number");
        }
        System.out.println(sum);

    }
}
