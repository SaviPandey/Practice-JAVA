import java.util.Scanner;
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        System.out.print("Enter the range of the series: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 1;

        while (i <= n) {
            sum += (Math.pow(x, i) / i);
            i++;
        }

        System.out.println("The sum of the series is: " + sum);

        sc.close();
    }
}
