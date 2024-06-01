import java.util.*;

public class Grade {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter 4 paper Marks:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        double total = n1+n2+n3+n4;
        double percent = (total/400)*100 ; 
        System.out.println(percent);
        if(percent>=90){
            System.out.println("Grade A");
        }
        else if(percent>=80 && percent<90 ){
            System.out.println("Grade B");

        }
        else if(percent >=70 && percent<80 ){
            System.out.println("Grade c");
        }
        else if(percent >=60 && percent<70 ){
            System.out.println("Grade D");
        }
        else if(percent >=40 && percent < 60 ){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
    
}