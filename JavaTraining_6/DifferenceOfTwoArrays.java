import java.util.Arrays;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int arr2[]= {2,4,6};
        int res1[] = new int[2];
        int res2[] = new int[2] ;
        int k =0;
        

        for(int i =0; i<arr.length ; i++){
            int present =0;
            
            
            for(int j=0; j<arr2.length ; j++){
                if(arr[i] == arr2[j]){
                    present=1;
                    break;
                }
            }
            if(present ==1){
                continue;
            }
            
            res1[k] += arr[i];
            k++;
        }
        k=0;
        for(int i =0; i<arr2.length ; i++){
            int present =0;
            // k=0;


            for(int j=0; j<arr.length ; j++){
                if(arr2[i] == arr[j]){
                    present=1;
                    break;
                }
            }
            if(present ==1){
                continue;
            }
            res2[k] += arr2[i];
            k++;
        }

        System.out.println();
        System.out.println("["+Arrays.toString(res1)+","+Arrays.toString(res2)+"]");
        System.out.println();
    }

}
