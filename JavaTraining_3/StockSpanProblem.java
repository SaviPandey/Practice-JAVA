//StockSpanProblem 
import java.util.*;
public class StockSpanProblem {
    public static void main(String[] args) { 
        // int arr[] = {100 ,80  , 60 ,70 ,60 , 75, 85};
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter " + n + " elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int resArr[] = new int[n] ;


        for (int i = 0; i < n; i++) {
            if (i == 0) {
                resArr[i] = 1;
            }
            else {
                if (arr[i] > arr[i - 1]) {
                    resArr[i] = (int) Math.pow(2, 3);
                }
                else if (arr[i] == arr[i - 1]) {
                    resArr[i] = 2;
                }
                else {
                    resArr[i] = 1;
                }
            }
        }

        System.out.print("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(resArr[i] + "\t");
        }
        System.out.println();

        sc.close();
        
    }
}
