import java.util.*;
public class SwitchArith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b=sc.nextInt();
        int res = 0;
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit");
        System.out.print("Select an choice of operation :");
        int choice = sc.nextInt();
        switch(choice){
            case 1 : res = a + b ;
                    System.out.println("Addition is "+res);
                    break;
            case 2 : res = a-b ;
                    System.out.println("Subtraction is "+res); 
                    break;
            case 3 : res = a * b ;
                    System.out.println("Multiplication is "+res);
                    break;  
            case 4 : res = a / b ;
                    System.out.println("Division is "+res);
                    break;
            default :
                    System.out.println("Invalid Choice!");
        }
        sc.close();
    }
}
