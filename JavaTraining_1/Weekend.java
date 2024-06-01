import java.util.*;
public class Weekend {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter day of week('Mon'/'Tue'/'Wed'...etc):");
        String day = sc.next();
        String sun ="Sun";
        if(day.equals(sun) || day.equals("Sat")){
            System.out.println("Today is Weekend");
        }
        else{
            System.out.println("Today is a working day");
        }
        sc.close();
    }

}
