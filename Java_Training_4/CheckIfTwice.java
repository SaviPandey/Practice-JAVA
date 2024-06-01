import java.util.*;
public class CheckIfTwice {

    public boolean duplicateCheck(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckIfTwice a = new CheckIfTwice();

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter " + n + " digits in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean b = a.duplicateCheck(arr, n);
        System.out.println("Are there duplicates in the array: " + b);

        sc.close();
    }
}