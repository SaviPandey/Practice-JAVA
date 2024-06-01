import java.util.Scanner;

public class MinMaxInSingleLL {
    
    public static Scanner sc = new Scanner(System.in);
    public LinkedList head = new LinkedList();
    public int size = 0;

    MinMaxInSingleLL() {
        head = null;
    }

    public void addEnd(int data) {
        LinkedList newNode = new LinkedList(data);

        if (head == null) {
            head = newNode;
        }
        else {
            LinkedList ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
        }
    }

    public int min() {
        LinkedList ptr = head;

        int min = Integer.MAX_VALUE;
        while (ptr != null) {
            if (min > ptr.data) {
                min = ptr.data;
            }
            ptr = ptr.next;
        }

        return min;
    }

    public int max() {
        LinkedList ptr = head;

        int max = Integer.MIN_VALUE;
        while (ptr != null) {
            if (max < ptr.data) {
                max = ptr.data;
            }
            ptr = ptr.next;
        }

        return max;
    }

    public static void main(String[] args) {
        MinMaxInSingleLL m = new MinMaxInSingleLL();

        System.out.print("Enter an element in the stack/type -1 to stop: ");
        int num = sc.nextInt();

        while (num != -1) {
            m.addEnd(num);
            System.out.print("Enter an element in the stack/type -1 to stop: ");
            num = sc.nextInt();
        }

        int min = m.min();
        int max = m.max();

        System.out.println("The maximum element is: " + max);
        System.out.println("The maximum element is: " + min);
    }
}

class LinkedList {
    public int data;
    LinkedList next;

    LinkedList() {
        next = null;
    }

    LinkedList(int data) {
        this.data = data;
        this.next = null;
    }
}