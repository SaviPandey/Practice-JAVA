import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,5};
        // int n = 5;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of N : ");
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        System.out.println("Enter "+(n-1)+" numbers in the array");
        for(int i=0; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        
        
        int present =0 ;
        int result = 0;
        Arrays.sort(arr);

        for(int i = 0 ; i< n ; i++){
            present =0;
            for(int j=1 ; j< arr.length ; j++){
                if(arr[j] == i){
                    present =1 ;
                }
            }
            if(present != 1 ){
                result = i;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
