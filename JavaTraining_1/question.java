import java.util.*;

public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(checkNums(num1 , num2));
        sc.close();
    }

    public static Object checkNums(int num1 , int num2) {

        if (num2 > num1) {
            return true;
        } else if (num1 == num2) {
            return -1;
        }
        return false;
    }
}
