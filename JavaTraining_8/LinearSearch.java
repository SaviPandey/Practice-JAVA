import java.util.Scanner;

public class LinearSearch {
    public static void allOccurences(int arr[], int key , int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i+" ");
        }
        allOccurences(arr, key, i+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();
        int []  arr = new int[n+1];
        System.out.print("Enter numbers in Arrays : ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Key :");
        int key = sc.nextInt();
        allOccurences(arr, key , 0);
        sc.close();

    }
}
