import java.util.*;
class Operation{
    Scanner sc = new Scanner(System.in);
    public void factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=1 ; i<=num ; i++){
            fact = fact* i;
        }
        System.out.println("Factorial is :"+fact);
    }
    public int power(){
        System.out.println("Enter the base value : ");
        int x= sc.nextInt();
        int copyX = x;
        System.out.println("Enter the power value : ");
        int pow = sc.nextInt();
        int res =1;
        if(x == 0){
            System.out.println("Base is 0 , so power will also be Zero !");
            return 0;
        }
        for(int i =1 ; i<=pow ; i++){
            res = res*x;
        }
        System.out.println("The value of "+copyX+" power "+pow+" = "+res);
        return 0;
          
    }

}

public class ClassObjectMenuDriven {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Operation o = new Operation();
        
        while(true){
            System.out.println("\n1.Factorial ");
            System.out.println("2.Power");
            System.out.println("3.SquareRoot ");
            System.out.println("\nSelect your choice :");
            int ch = sc.nextInt();

            switch(ch){
                case 1 : o.factorial();
                         break;
                case 2 : o.power();
                         break;
                default : System.exit(0);

            }
        }
    }
}
