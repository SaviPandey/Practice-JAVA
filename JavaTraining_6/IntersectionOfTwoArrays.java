import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int arr[] = {1,2,2,1};
        int arr2[]= {2,2};
        int res1[] = new int[2];
        // int res2[] = new int[2] ;
        int k =0;
        

        for(int i =0; i<arr.length ; i++){            
            
            for(int j=0; j<arr2.length ; j++){
                if(arr[i] == arr2[j]){
                    res1[k] += arr[i];
                    k++;
                    break;
                }
                else{
                    continue;
                }
            }
            
        }
    
        System.out.println();
        System.out.println("["+Arrays.toString(res1)+"]");
        System.out.println();
    }

}
