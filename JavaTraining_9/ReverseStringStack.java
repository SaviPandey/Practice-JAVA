import java.util.*;
class Stack {
    Scanner sc = new Scanner(System.in);
    final int CAPACITY = 20;
    int top = -1;
    Character stacks[] = new Character[10];    

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

    public void push(char x) {
        if (isFull()==false) {
            top++;
            stacks[top] = x;
        } else {
            System.out.println("Stack is full!");
        }
    }

    public char pop(){
        if(isEmpty()){
            System.out.println("Stack already Empty!");
        }
        top--;
        return stacks[top+1];
    } 
}
public class ReverseStringStack {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack s1 = new Stack();
        System.out.println("Enter any String : ");
        String str =  sc.nextLine();
        String revStr = "";

        for(int i=0; i<str.length(); i++){
            s1.push(str.charAt(i));
        }
        System.out.println("Reverse String: ");
        for(int i=s1.top; i>=0; i--){
            revStr+=(char)s1.pop();
        }
        System.out.println(revStr);
        // System.out.println(Arrays.toString(s1.stacks));
        sc.close();
    }
}
