import java.util.Scanner;

class Stacks {
    final int capacity = 10;
    int top = -1;
    int stack[] = new int[capacity];
    String name;
    Scanner sc = new Scanner(System.in);

    public boolean isFull() {
        if (top >= (capacity - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full, cannot perform push operation.");
        } else {
            stack[++top] = element;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot perform pop operation.");
        } else {
            top--;
        }
    }

    public void peek() {
        int element = stack[top];
        System.out.println("The element at the top of the stack is: " + element);
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("Cannot traverse the stack, the stack is currently empty.");
        } else {
            System.out.println(name + " contains " + (top + 1) + " litres of water.");
            System.out.println("The " + name + " elements are as follows: ");
            for (int i = top; i >= 0; i--) {
                if (i == top) {
                    System.out.println(stack[i] + " <--Top");
                } else {
                    System.out.println(stack[i]);
                }
            }
            System.out.println();
        }
    }
}

public class WaterJug {
    public static void main(String[] args) {
        Stacks jug1 = new Stacks();
        Stacks jug2 = new Stacks();
        jug1.name = "jug1";
        jug2.name = "jug2";

        System.out.println("Initially, it looks as follows: ");
        for (int i = 0; i < 5; i++) {
            jug1.push(1);
        }

        jug1.traverse();
        jug2.traverse();

        System.out.println("Transferring 3 litres from jug1 to jug2.");
        for (int i = 0; i < 3; i++) {
            jug1.pop();
        }
        for (int i = 0; i < 3; i++) {
            jug2.push(1);
        }
        jug1.traverse();
        jug2.traverse();

        System.out.println("Emptying jug2 completely.");
        for (int i = 0; i < 3; i++) {
            jug2.pop();
        }
        jug1.traverse();
        jug2.traverse();

        System.out.println("Transferring 2 litres from jug1 to jug2");
        for (int i = 0; i < 2; i++) {
            jug1.pop();
            jug2.push(1);
        }

        jug1.traverse();
        jug2.traverse();

        System.out.println("Refilling 5 litres in jug1: ");
        for (int i = 0; i < 5; i++) {
            jug1.push(1);
        }
        jug1.traverse();
        jug2.traverse();

        System.out.println("Transferring 1 litre from jug1 to jug2.");
        jug1.pop();
        jug2.push(1);

        jug1.traverse();
        jug2.traverse();
    }
}