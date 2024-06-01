import java.util.Scanner;

class Stack {
    Scanner sc = new Scanner(System.in);
    final int CAPACITY = 3;
    int top = -1;
    int stacks[] = new int[3];    

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

    public void pop() {
        if(isEmpty()==false) {
            stacks[top] = 0;
            top--;
        } else {
            System.out.println("Stack is empty");
        }
    }
}

public class TowerOfHanoi {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        Stack s3 = new Stack();

        System.out.println("Initial Stage");
        s1.push(3);
        s1.push(2);
        s1.push(1);

        System.out.println("------------------");
        for(int i =  s3.stacks.length - 1; i >= 0 ; i-- ) {
            System.out.println(s1.stacks[i]+"\t"+s2.stacks[i]+"\t"+s3.stacks[i]);
        }
        System.out.println("------------------");

        System.out.println("Move 1 from s1 to s3");
        System.out.println();
        s1.pop();
        s3.push(1);

        for(int i =  s3.stacks.length - 1; i >= 0 ; i-- ) {
            System.out.println(s1.stacks[i]+"\t"+s2.stacks[i]+"\t"+s3.stacks[i]);
        }
        System.out.println("------------------");

        System.out.println("Move 2 from s1 to s2");
        s1.pop();
        s2.push(2);

        for(int i =  s3.stacks.length - 1; i >= 0 ; i-- ) {
            System.out.println(s1.stacks[i]+"\t"+s2.stacks[i]+"\t"+s3.stacks[i]);
        }
        System.out.println("------------------");

        System.out.println("Move 1 from s3 to s2");
        System.out.println();
        s3.pop();
        s2.push(1);

        for(int i =  s3.stacks.length - 1; i >= 0 ; i-- ) {
            System.out.println(s1.stacks[i]+"\t"+s2.stacks[i]+"\t"+s3.stacks[i]);
        }
        System.out.println("------------------");

        System.out.println("Move 3 from s1 to s3");
        System.out.println();
        s1.pop();
        s3.push(3);

        for(int i =  s3.stacks.length - 1; i >= 0 ; i-- ) {
            System.out.println(s1.stacks[i]+"\t"+s2.stacks[i]+"\t"+s3.stacks[i]);
        }
        System.out.println("------------------");

        System.out.println("Move 1 from s2 to s1");
        System.out.println();
        s2.pop();
        s1.push(1);

        for(int i =  s3.stacks.length - 1; i >= 0 ; i-- ) {
            System.out.println(s1.stacks[i]+"\t"+s2.stacks[i]+"\t"+s3.stacks[i]);
        }
        System.out.println("------------------");

        System.out.println("Move 2 from s2 to s3");
        System.out.println();
        s2.pop();
        s3.push(2);

        for(int i =  s3.stacks.length - 1; i >= 0 ; i-- ) {
            System.out.println(s1.stacks[i]+"\t"+s2.stacks[i]+"\t"+s3.stacks[i]);
        }
        System.out.println("------------------");

        System.out.println("Move 1 from s1 to s3");
        System.out.println();
        s1.pop();
        s3.push(1);

        for(int i =  s3.stacks.length - 1; i >= 0 ; i-- ) {
            System.out.println(s1.stacks[i]+"\t"+s2.stacks[i]+"\t"+s3.stacks[i]);
        }
        System.out.println("------------------");
    }
}