import java.util.*;
// import java.util.Scanner;

public class SortMobNumbers {
    public static void selectionSort(long mobile[]){
        for(int i =0; i< mobile.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<mobile.length; j++){
                if(mobile[minPos] > mobile[j]){
                    minPos = j;
                }
            }
            long temp = mobile[minPos];
            mobile[minPos] = mobile[i];
            mobile[i] = temp;
        }
    }
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter 10 mobile numbers : ");
        long[] mobile = new long[10];
        boolean all10Digits = true;
        for(int i=0; i<10; i++){   
            mobile[i] = sc.nextLong();
            if(String.valueOf(mobile[i]).length() != 10) {
                all10Digits = false;
                break;
            }
        }

        if (all10Digits) {
            selectionSort(mobile);
            for(int i=0; i<mobile.length; i++ ){
                if(i>=4 && i<=7){
                    System.out.println(mobile[i]+"=>Hello");
                }
                else{
                    System.out.println(mobile[i]+"=>Hi");
                }
            }
            for(int i=0; i<mobile.length; i++){
                System.out.print(mobile[i]+ " ");
            }
        } else {
            System.out.println("One or more numbers are not 10 digits long. Sorting skipped.");
        }

        sc.close();
     }
}