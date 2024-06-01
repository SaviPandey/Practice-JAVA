import java.util.*;
public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range:");
        int num = sc.nextInt();
        int f0 =0 , f1 =1 , f2=0;
        System.out.print(f0 +" "+f1);
        for(int i =3 ; i<=num ; i++){
            f2 =f0 + f1;
            System.out.print(f2+" ");
            f1 = f0;
            f2 = f1;
        }
        sc.close();

    }
}
