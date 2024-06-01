import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i =0; i< arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for(int i =0; i<n; i++){
         arr[i] = sc.nextInt();
        }
        System.out.println("Original Array:"+Arrays.toString(arr) );
        selectionSort(arr);
        for(int i=0; i<n; i++){
         System.out.print(arr[i]+ " ");
        }
        sc.close();
     }
}
