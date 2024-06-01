import java.util.*;

public class StackOperations{
    public final int capacity = 10;
    public int top = -1;
    public int stack[] = new int[capacity]; //stack array
    public Scanner sc = new Scanner(System.in);

    public  boolean isFull() {
        if(top>=capacity-1){
            return true;
        }    
        else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }
    public void push(){
        System.out.print("Enter data to push: ");
        int data = sc.nextInt();
        if(isFull()){
            System.out.println("Stack is Already Full!");
        }
        top++;
        stack[top] = data;
        System.out.println("Data Pushed into Stack!");

    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack already Empty!");
        }
        top--;
        System.out.println("Removed data from Top : "+ stack[top+1]);
    } 
    public void peek(){
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
        }
        else{
            System.out.println("Stack Top : "+stack[top]);
        }
    }

    public void traverse(){
        for(int i=top; i>=0; i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackOperations s = new StackOperations();
        int choice;
        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Traverse");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.traverse();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
        sc.close();
    }
}