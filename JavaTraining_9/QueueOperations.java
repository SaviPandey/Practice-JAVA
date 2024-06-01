import java.util.*;
public class QueueOperations {
    public final int capacity = 10;
    public int front = 0;
    public int rear = -1;
    public int queue[] = new int[capacity]; //Queue array
    public Scanner sc = new Scanner(System.in);

    public boolean isFull(){
       if(rear == capacity-1){
        return true;
       }
       else{
           return false;
       }
    }
    public boolean isEmpty(){
        if(rear == -1){
         return true;
        }
        else{
            return false;
        }
     }

    public void enqueue() {
       System.out.print("Enter an element : ");
       int data = sc.nextInt();
       if(isFull()){
        System.out.println("Already Full!");
       }
       rear++;
       queue[rear] = data;
    } 

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Already Empty!");
        }
        for (int i = front; i <= rear; i++) {
            queue[i] = queue[i + 1];
        }
        // queue[rear] = -1; // Set the last element to 0 or any default value
        rear--;
    }

    public void display(){
        System.out.println("**** Queue ****");
        for(int i=front; i<=rear; i++){
            System.out.print(" "+queue[i]+" | ") ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueOperations q = new QueueOperations();
        int choice;
        do {
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
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
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
        sc.close();
    }
    
}
