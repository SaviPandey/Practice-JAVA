import java.util.Scanner;
public class ArrayChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int digits[] = new int[4];
        
        System.out.print("Enter 4 digits: ");
        for(int i = 0; i < 4; i++) {
            digits[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(digits[i] + "-" + (char) (digits[i]) + "\t");
        }

        sc.close();
    }
}
