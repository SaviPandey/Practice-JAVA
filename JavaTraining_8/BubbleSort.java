import java.util.*;
public class BubbleSort {

    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                   
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.print("Enter the size of Array : ");
       int n = sc.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter the elements: ");
       for(int i =0; i<n; i++){
        arr[i] = sc.nextInt();
       }
       System.out.println("Original Array:"+Arrays.toString(arr) );
       bubbleSort(arr);
       for(int i=0; i<n; i++){
        System.out.print(arr[i]+ " ");
       }
       sc.close();
    }
}
