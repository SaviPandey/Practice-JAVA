import java.util.*;

public class InsertInArray {
    public static void insertArray(int array[], int loc, int num) {
        for (int i = array.length - 1; i > loc; i--) {
            array[i] = array[i - 1];
        }
        array[loc] = num;
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();
        int[] array = new int[n + 1];
        System.out.print("Enter numbers in Arrays : ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter Number to be Inserted : ");
        int num = sc.nextInt();
        System.out.println("Enter location to be Inserted : ");
        int loc = sc.nextInt();
        insertArray(array, loc, num);
        sc.close();
    }
}
