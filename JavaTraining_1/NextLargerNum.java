import java.util.*;
public class NextLargerNum {
    public static void main(String[] args) {
       int arr[] = {1 , 3 , 2 , 4 };
       for(int i =0 ; i< arr.length ; i++){
         for(int j=i+1 ; j<arr.length ; j++){ 
            if(arr[i]<arr[j]){
                System.out.print(arr[j]+" ");
                break;
            }
       } 

    }
    arr[arr.length-1]= -1;
    System.out.println(arr[arr.length-1]);
    }
}
