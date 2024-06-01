import java.util.*;
public class QueueLL {

    public class GetNode {
        int data;
        GetNode next;
        public  GetNode(){
            next = null;
        }
    }
    GetNode front, rear = null;

    GetNode head = null;
    Scanner sc = new Scanner(System.in);

    @SuppressWarnings("unused")
    public void enqueue(){
        System.out.print("Enter data to be inserted: ");
        int data = sc.nextInt();

        GetNode newNode = new GetNode();
        newNode.data = data;
        if(newNode == null){
            System.out.println("Memory is Empty");
        }
        else if(front==null){
            front = newNode;
        } else{
            GetNode ptr = front;
            while(ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = newNode;
            System.out.println(data+" appended successfully!");
            rear =  newNode;
        }
    }
    public void dequeue(){
        GetNode ptr = front;
        GetNode prevPtr = head;
        while(ptr.next != null){
            prevPtr = ptr;
            ptr = ptr.next;
        }
        prevPtr.next = null;
        System.out.println("Deleted node from End!");
    }

    public void peekFirst() {
        if (front == null) {
            System.out.println("The linked list is empty");
            return ;
        }
        System.out.println("The data at the top is: " + front.data);
    }

    public void peekLast(){
        if (front == null) {
            System.out.println("The linked list is empty");
            return;
        }
        System.out.println("The data at the top is: " + rear.data);
    }

    public void traverse(){
        GetNode ptr = front;
        while(ptr!=null){
            System.out.print("|"+ptr.data+"|");
            ptr = ptr.next;
        }
        ptr = null;
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Enqueue an element");
            System.out.println("2. Dequeue an element");
            System.out.println("3. Peek front Element");
            System.out.println("4.Peek last element");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    q.enqueue();
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.peekFirst();
                    break;

                case 4:
                    q.peekLast();
                    break;
                case 5:
                    q.traverse();
                    break;  
                case 6: 
                    System.out.println("Stopped! Bye");
                    break;
                default:
                    break;
            }
        }while(choice <= 6 && choice >= 1);
        sc.close();
    }
}
