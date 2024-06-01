import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    //     int[] ans = new int[arr.length];
    //     int n = arr.length;
    //     int steps = 5, j = 0;

    //     for (int i = n - 1; i >= n - steps; i--) {
    //         ans[j] = arr[i];
    //         j += 1;
    //     }

    //     int k = j;
    //     for (int i = 0; i < n - steps; i++) {
    //         ans[k] = arr[i];
    //         k += 1;
    //     }

    //     System.out.println(Arrays.toString(ans));
    // }

    public int CAPACITY = 10;
    public int[] queue = new int[CAPACITY];
    public int front = 0;
    public int rear = -1;

    public void enqueue(int element) {
        rear += 1;
        queue[rear] = element;
    }

    public int dequeue() {
        int j = front;
        int element = queue[front];
        while (j < rear) {
            queue[j] = queue[j + 1];
            j += 1;
        }
        queue[rear] = -1;
        rear -= 1;

        return element;
    }

    public static void main(String[] args) {
        RotateArray ar = new RotateArray();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element in a queue: ");
        int n = sc.nextInt();
        while (n != -1) {
            ar.enqueue(n);
            System.out.print("Enter the element in a queue: ");
            n = sc.nextInt();
        }

        System.out.print("Enter the number of steps: ");
        int steps = sc.nextInt();

        for (int i = 0; i <= ar.rear - steps; i++) {
            int e = ar.dequeue();
            ar.enqueue(e);
        }

        System.out.println(Arrays.toString(ar.queue));
    }
}