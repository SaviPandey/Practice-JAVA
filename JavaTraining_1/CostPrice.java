import java.util.*;
public class CostPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost Price:");
        int cost = sc.nextInt();

        System.out.println("Are you a student :(Yes/No)");
        String stu = sc.next();

        double disc = 0.0;
        if(stu.equals("Yes") ){
            if(cost>500){
                 disc = (cost/100)*10;
            }
            else{
                 disc = (cost/100)*5;
            } 
        }
        else if(stu.equals("No")){
            if(cost >500){
                 disc = (cost/100)*8;

            }
            else{
                 disc = (cost/100)*2;
            }
        }
        System.out.println("The cp is " + cost);
        System.out.println("The discount is " + disc);
        double netCost = cost- disc ;
        System.out.println("Net price is: "+netCost);
        sc.close();
    }
}
