import java.util.Scanner;
import java.util.Arrays;
public class LCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int prev = 0;
        int maxLCS = 0;
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            if (prev == 0) {
                prev = arr[i];
                continue;
            }
            else if((prev + 1) == arr[i]) {
                prev = arr[i];
                count += 1;
            }
            else {
                if (maxLCS < count) {
                    prev = arr[i];
                    maxLCS = count;
                    count = 1;
                }
                else {
                    prev = arr[i];
                    count = 1;
                    continue;
                }
            }
        }

        if (count != 1) {
            if (maxLCS < count) {
                maxLCS = count;
            }
        }

        System.out.println("The longest common subsequence is: " + maxLCS);

        sc.close();
    }
}