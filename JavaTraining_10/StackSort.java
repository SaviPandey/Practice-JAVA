import java.util.Scanner;

public class StackSort {

    public int CAPACITY = 10;
    public int[] stack = new int[CAPACITY];
    public int top = -1;
    public static Scanner sc = new Scanner(System.in);

    public boolean full() {
        if (top == CAPACITY - 1) {
            return true;
        }
        return false;
    }

    public boolean empty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public void push(int element) {
        if (full()) {
            System.out.println("The stack is full");
            return ;
        }

        top += 1;
        stack[top] = element;

        // System.out.println("The element to be pushed is: " + element);
    }

    public int pop() {
        if (empty()) {
            System.out.println("The stack is empty");
            return -1;
        }

        int element = stack[top];
        top -= 1;

        return element;

        // System.out.println("The element to be popped is: " + element);
    }

    public int peek() {
        if (empty()) {
            System.out.println("The stack is empty");
            return -1;
        }

        int element = stack[top];

        // System.out.println("The element at top is: " + element);
        return element;
    }

    public void traverse() {
        if (empty()) {
            // System.out.println("The stack is empty");
            return ;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        StackSort s = new StackSort();
        StackSort temp = new StackSort();

        System.out.print("Enter an element in the stack/type -1 to stop: ");
        int num = sc.nextInt();

        while (num != -1) {
            s.push(num);
            System.out.print("Enter an element in the stack/type -1 to stop: ");
            num = sc.nextInt();
        }

        while (s.top != -1) {
            int element = s.pop();
            while (temp.peek() > element) {
                int e = temp.pop();
                s.push(e);
            }
            temp.push(element);
        }

        temp.traverse();
    }
}