import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();

        int max = n1;
        if(max<n2){
            max=n2;
        }
        if(max<n3){
            max=n3;
        }
        if(max<n4){
            max=n4;
        }
        if(max<n5){
            max=n5;
        }
        System.out.println(max);
        sc.close();
}
}