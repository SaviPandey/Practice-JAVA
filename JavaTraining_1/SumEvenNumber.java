import java.util.*;
public class SumEvenNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range of numbers :");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1 ; i<=num ; i++){
        if(i%2==0){
            sum =sum +i;
        }
        else{
            continue;
        }
        }
        System.out.println("Sum of Even numbers :"+ sum);
        sc.close();
    }
}
