import java.util.Scanner;

public class StackLL {
    public static Scanner sc = new Scanner(System.in);
    public LinkedList top = new LinkedList();

    StackLL() {
        top = null;
    }

    public void push() {
        System.out.print("Enter the data to enter: ");
        int data = sc.nextInt();

        LinkedList newNode = new LinkedList(data);

        if (top == null) {
            top = newNode;
        }
        else {
            LinkedList ptr = top;
            top = newNode;
            top.next = ptr;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("The linked list is empty");
            return ;
        }
        top = top.next;
    }

    public void peek() {
        if (top == null) {
            System.out.println("The linked list is empty");
            return ;
        }

        System.out.println("The data at the top is: " + top.data);
    }

    public void traverse() {
        LinkedList ptr = top;
        while (ptr != null) {
            System.out.println("data: " + ptr.data);
            ptr = ptr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackLL L = new StackLL();

        int choice = 0;
        do {
            System.out.println("1. Push an element");
            System.out.println("2. Pop an element");
            System.out.println("3. Peek an element");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    L.push();
                    break;

                case 2:
                    L.pop();
                    break;

                case 3:
                    L.peek();
                    break;

                case 4:
                    L.traverse();
                    break;
                
                default:
                    break;
            }
        }while(choice <= 4 && choice >= 1);
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