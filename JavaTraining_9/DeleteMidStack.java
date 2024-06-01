import java.util.*;

public class DeleteMidStack {
    Scanner sc = new Scanner(System.in);
    final int CAPACITY = 20;
    int top = -1;
    int stacks[]; 
    DeleteMidStack(int n){
        stacks = new int[n];
    }   

    public boolean isFull() {
        if (top>=CAPACITY-1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }

    public void push(int x) {
        if (isFull()==false) {
            top++;
            stacks[top] = x;
        } else {
            System.out.println("Stack is full!");
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack already Empty!");
        }
        top--;
        return stacks[top+1];
    } 

    public void traverse(){
        for(int i=top; i>=0; i--){
            System.out.print(stacks[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of stack : ");
        int n = sc.nextInt();
        DeleteMidStack s = new DeleteMidStack(n);
        DeleteMidStack s2 = new DeleteMidStack(n);
        System.out.print("Enter elements in stack: ");
        for(int i=0; i<n; i++){
            s.push(sc.nextInt());
        }
        System.out.println("Orginal Stack");
        s.traverse();

        int mid = (int)((0 + s.top)/2);

        int[] tempStack = new int[n];

        for(int i=0; i<=mid ; i++){
            int data =s.pop();
            s2.push(data);
        }
        s2.pop();
        for(int i=s2.top; i>=0; i--){
            int data=s2.pop();
            s.push(data);
        }
        System.out.println("Stack after Removing Middle Element: ");
        s.traverse();
        sc.close();
        // s2.traverse();
    }
}
