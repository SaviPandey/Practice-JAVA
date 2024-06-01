import java.util.*;

public class DeleteFromArray {
    public static void deleteArray(int arr[], int loc) {
        int n = arr.length;
        for (int i = loc; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = 0; // Set the last element to 0 or any default value
        System.out.println("The array after deletion is : " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the position to delete: ");
        int loc = sc.nextInt();
        deleteArray(arr, loc);
        sc.close();
    }
}
