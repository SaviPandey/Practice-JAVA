import java.util.*;
public class NextLargerElement{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter "+n+" numbers in the array: ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int resArr[] = new int[n];

        //Traversing through the array
        for(int i=0 ; i< n ; i++){
            int nextLarger = -1;
            for(int j =i+1 ; j<n ;j++){
                if(arr[i] < arr[j]){
                    nextLarger = arr[j];
                    break;
                }
            }
            resArr[i] = nextLarger;
        }
        System.out.println("Output: ");
        for(int i=0 ; i<n ; i++){
            System.out.print(resArr[i]+" ");
        }
        sc.close();
    }
}