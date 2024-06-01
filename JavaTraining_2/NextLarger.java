import java.util.*;
public class NextLarger {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 2, 10, 11};
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            j = i + 1;
            int nextLarger = 0;
            while (j < arr.length) {
                if (arr[i] < arr[j]) {
                    nextLarger = arr[j];
                    break;
                }
                j++;
            }
            arr[i] = nextLarger;
        }
        arr[j - 1] = -1;

        System.out.println(Arrays.toString(arr));
    }
}
