import java.util.*;
public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr ){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
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
        insertionSort(arr);
        for(int i=0; i<n; i++){
         System.out.print(arr[i]+ " ");
        }
        sc.close();
     }
}
