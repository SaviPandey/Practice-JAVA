import java.util.*;
public class RotateLL {

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
    public void enqueue(int num){

        GetNode newNode = new GetNode();
        newNode.data = num;
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
            System.out.println(num+" appended successfully!");
            rear =  newNode;
        }
    }
    public int dequeue(){
        if(front ==null){
            System.out.println("The linked list is Empty!");
        }
        int element = front.data;
        front = front.next;
        return element;
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
        RotateLL q = new RotateLL();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in LinkedList (press -1 to stop): ");
        int num = sc.nextInt();
        while(num != -1){
            q.enqueue(num);
            System.out.print("Enter an element in the stack/type -1 to stop: ");
            num = sc.nextInt();
        }
        System.out.print("Enter key to rotate: ");
        int key = sc.nextInt();
        GetNode ptr = q.front;
        for(int i =1; i<=key; i++){
           int data= q.dequeue();
           q.enqueue(data);
        }
        q.traverse();
        sc.close();
    }
}
