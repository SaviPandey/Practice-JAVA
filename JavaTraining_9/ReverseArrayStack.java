import java.util.*;

class Stack {
    Scanner sc = new Scanner(System.in);
    final int CAPACITY = 20;
    int top = -1;
    int stacks[] = new int[20];    

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
}

public class ReverseArrayStack {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack s = new Stack();
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter"+ n +"elements in array : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            s.push(arr[i]);
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = s.pop();
        }

        System.out.println(Arrays.toString(s.stacks));
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
