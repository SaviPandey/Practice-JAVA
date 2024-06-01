import java.util.*;
public class BinarySearch {
    public static int binarySearch(int arr[] ,int key ){
        Arrays.sort(arr);
        int beg = 0;
        int loc =0;
        int end = arr.length-1;
        int mid = beg+end/2;
        while (key != arr[mid] && beg <=end) {

             if(key<arr[mid]){
                end = mid-1;
             }
             else{
                beg = mid +1 ;
             }
             mid = beg + (end -beg)/2;   
        }
        if(key == arr[mid]){
            loc = mid;
        }
        return loc;
    }

    public static void main(String[] args) {
        int arr[] = {4,  3, 6, 7, 0, 1, 2};
        int key =3;
        System.out.print(binarySearch(arr, key));
    }
}
