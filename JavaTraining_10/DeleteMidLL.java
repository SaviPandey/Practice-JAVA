import java.util.Scanner;

public class DeleteMidLL {
    public static Scanner sc = new Scanner(System.in);
    public LinkedList head = new LinkedList();
    public int size = 0;

    DeleteMidLL() {
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
        size += 1;
    }

    public void delMid(int mid) {
        if (head == null) {
            System.out.println("The linked list is empty");
            return ;
        }

        LinkedList ptr = head;
        LinkedList del_ptr = head;
        int i = 0;

        while (i != mid) {
            ptr = del_ptr;
            del_ptr = del_ptr.next;
            i += 1;
        }

        ptr.next = del_ptr.next;
        del_ptr = null;
    }

    public void traverse() {
        LinkedList ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + "-->");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteMidLL d = new DeleteMidLL();

        System.out.print("Enter an element in the stack/type -1 to stop: ");
        int num = sc.nextInt();

        while (num != -1) {
            d.addEnd(num);
            System.out.print("Enter an element in the stack/type -1 to stop: ");
            num = sc.nextInt();
        }

        int mid = (int) (d.size / 2);

        d.delMid(mid);

        d.traverse();
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
