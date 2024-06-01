import java.util.*;
public class ArrayPrac6 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Arrays.fill(arr, 100);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        System.out.println();
        Arrays.fill(arr, 3, 6, 44);
        System.out.print(Arrays.toString(arr));
    }
}
