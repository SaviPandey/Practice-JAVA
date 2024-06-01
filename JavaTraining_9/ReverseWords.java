import java.util.Scanner;

public class ReverseWords {

    public char[] stack = new char[100];
    public int top = -1; 

    public void push(char element) {
        top += 1;
        stack[top] = element;

        // System.out.println("The element to be pushed is: " + element);
        // return top;
    }

    public char pop() {
        // int element = stack[top];
        char element = stack[top];
        stack[top] = ' ';
        top -= 1;

        return element;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseWords r = new ReverseWords();

        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            r.push(str.charAt(i));
        }

        String temp = "";
        String rev = "";
        while (r.top != -1) {
            char e = r.pop();
            if (e == ' ') {
                rev = temp + ' ' + rev;
                temp = "";
                continue;
            }
            temp += e;
        }
        rev = temp + ' ' + rev;

        System.out.println("The reversed string is: " + rev);

        sc.close();
    }
}